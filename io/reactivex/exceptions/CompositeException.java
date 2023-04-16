package io.reactivex.exceptions.CompositeException;
import java.lang.RuntimeException;
import java.lang.Iterable;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Throwable;
import java.util.List;
import java.util.Collection;
import java.util.Set;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.Collections;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.util.Arrays;
import java.lang.StackTraceElement;
import io.reactivex.exceptions.CompositeException$a;
import io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain;
import java.util.HashSet;
import java.lang.System;
import java.io.PrintStream;
import io.reactivex.exceptions.CompositeException$b;
import java.io.PrintWriter;
import io.reactivex.exceptions.CompositeException$c;

public final class CompositeException extends RuntimeException	// class@00119f
{
    public Throwable cause;
    public final List exceptions;
    public final String message;
    public static final long serialVersionUID = 0x29ffcc6947b49592;

    public void CompositeException(Iterable p0){
       super();
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Throwable throwable = iterator.next();
             if (throwable instanceof CompositeException) {
                linkedHashSe.addAll(throwable.getExceptions());
             }else if(throwable != null){
                linkedHashSe.add(throwable);
             }else {
                linkedHashSe.add(new NullPointerException("Throwable was null!"));
             }
          }
       }else {
          linkedHashSe.add(new NullPointerException("errors was null"));
       }
       if (!linkedHashSe.isEmpty()) {
          uArrayList.addAll(linkedHashSe);
          List list = Collections.unmodifiableList(uArrayList);
          this.exceptions = list;
          this.message = list.size()+" exceptions occurred. ";
          return;
       }else {
          throw new IllegalArgumentException("errors is empty");
       }
    }
    public void CompositeException(Throwable[] p0){
       List list = (p0 == null)? Collections.singletonList(new NullPointerException("exceptions was null")): Arrays.asList(p0);
       super(list);
       return;
    }
    public final void a(StringBuilder p0,Throwable p1,String p2){
       char c = 10;
       p0 = p0+p2+p1+c;
       StackTraceElement[] stackTrace = p1.getStackTrace();
       int len = stackTrace.length;
       for (int i = 0; i < len; i = i + 1) {
          p0 = p0+"\t\tat "+stackTrace[i]+c;
       }
       if (p1.getCause() != null) {
          this.a(p0+"\tCaused by: ", p1.getCause(), "");
       }
       return;
    }
    public final void b(CompositeException$a p0){
       char c = 10;
       StringBuilder str = new StringBuilder(128)+this+c;
       StackTraceElement[] stackTrace = this.getStackTrace();
       int len = stackTrace.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+"\tat "+stackTrace[i]+c;
       }
       Iterator iterator = this.exceptions.iterator();
       len = 1;
       while (iterator.hasNext()) {
          str = str+"  ComposedException "+len+" :\n";
          this.a(str, iterator.next(), "\t");
          len = len + 1;
       }
       p0.a(str);
       return;
    }
    public synchronized Throwable getCause(){
       if (this.cause == null) {
          CompositeException$CompositeExceptionCausalChain uCompositeEx = new CompositeException$CompositeExceptionCausalChain();
          HashSet hashSet = new HashSet();
          Iterator iterator = this.exceptions.iterator();
          CompositeException$CompositeExceptionCausalChain uCompositeEx1 = uCompositeEx;
          while (iterator.hasNext()) {
             Throwable throwable = iterator.next();
             if (hashSet.contains(throwable)) {
             }else {
                hashSet.add(throwable);
                ArrayList uArrayList = new ArrayList();
                Throwable cause = throwable.getCause();
                if (cause != null && cause != throwable) {
                   uArrayList.add(cause);
                   Throwable cause1 = cause.getCause();
                   while (cause1 != null && cause1 != cause) {
                      cause = cause1;
                   }
                }
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   cause = iterator1.next();
                   if (hashSet.contains(cause)) {
                      throwable = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                   }else {
                      hashSet.add(cause);
                      continue ;
                   }
                }
                uCompositeEx1.initCause(throwable);
                this.getRootCause(uCompositeEx1);
             }
          }
          this.cause = uCompositeEx;
       }
       return this.cause;
    }
    public List getExceptions(){
       return this.exceptions;
    }
    public String getMessage(){
       return this.message;
    }
    public Throwable getRootCause(Throwable p0){
       Throwable cause = p0.getCause();
       if (cause == null || this.cause == cause) {
          return p0;
       }
       p0 = cause.getCause();
       while (p0 != null && p0 != cause) {
          cause = p0;
       }
       return cause;
    }
    public void printStackTrace(){
       this.printStackTrace(System.err);
    }
    public void printStackTrace(PrintStream p0){
       this.b(new CompositeException$b(p0));
    }
    public void printStackTrace(PrintWriter p0){
       this.b(new CompositeException$c(p0));
    }
    public int size(){
       return this.exceptions.size();
    }
}
