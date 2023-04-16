package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMediaArrayList;
import java.util.ArrayList;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMediaArrayList$a;
import nsd.u;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import com.yxcorp.gifshow.models.EmptyQMedia;
import java.util.Collection;
import java.lang.Iterable;
import java.lang.Number;
import java.lang.IndexOutOfBoundsException;
import java.util.function.Predicate;

public final class SwapMediaArrayList extends ArrayList	// class@001c27
{
    public boolean autoFill;
    public int maxSize;
    public static final SwapMediaArrayList$a Companion;
    public static final long serialVersionUID;

    static {
       SwapMediaArrayList.Companion = new SwapMediaArrayList$a(null);
    }
    public void SwapMediaArrayList(){
       super();
       this.maxSize = Integer.MAX_VALUE;
    }
    public void add(int p0,QMedia p1){
       if (PatchProxy.isSupport(SwapMediaArrayList.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, SwapMediaArrayList.class, "3")) {
          return;
       }
       a.p(p1, "element");
       super.add(p0, p1);
       this.b();
       "add index:"+p0+", element:"+p1+", maxSize:"+this.maxSize+", autoFill:"+this.autoFill+", "+"list:"+this.toString();
       return;
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public boolean add(QMedia p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "element");
       boolean b = false;
       if (this.autoFill != null) {
          obj = this.iterator();
          int i = 0;
          while (true) {
             if (obj.hasNext()) {
                if (obj.next() instanceof EmptyQMedia) {
                label_0037 :
                   if (i >= 0) {
                      if (i < this.maxSize) {
                         this.set(i, p0);
                         b = true;
                         break ;
                      }
                   }else {
                      b = super.add(p0);
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                i = -1;
                goto label_0037 ;
             }
          }
       }else if(this.size() < this.maxSize){
          b = super.add(p0);
       }
       this.b();
       "add element:"+p0+", maxSize:"+this.maxSize+", autoFill:"+this.autoFill+", list:"+this.toString();
       return b;
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean addAll(int p0,Collection p1){
       Iterator obj;
       if (PatchProxy.isSupport(SwapMediaArrayList.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, SwapMediaArrayList.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p1, "elements");
       boolean b = false;
       if (p1.isEmpty()) {
          return b;
       }else {
          int i = 1;
          if (((p1.size() + p0) - i) < this.maxSize) {
             b = true;
          }
          obj = p1.iterator();
          int i1 = p0;
          while (obj.hasNext()) {
             this.add(i1, obj.next());
             i1 = i1 + i;
          }
          this.b();
          "addAll, index:"+p0+", elements:"+p1+", list:"+this.toString();
          return b;
       }
    }
    public boolean addAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       this.b();
       "addAll, elements:"+p0+", list:"+this.toString();
       return super.addAll(p0);
    }
    public final boolean addAllAutoFill(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       int i = 1;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i = i & this.add(iterator.next());
       }
       this.b();
       "addAll, elements:"+p0+", list:"+this.toString();
       return i;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SwapMediaArrayList.class, "12")) {
          return;
       }
       SwapMediaArrayList tmaxSize = this.maxSize;
       if (this.size() > tmaxSize) {
          this.removeRange(tmaxSize, this.size());
       }else if(this.autoFill != null){
          while (this.size() < this.maxSize) {
             super.add(new EmptyQMedia(0));
          }
       }
       this.size();
       return;
    }
    public boolean contains(QMedia p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.contains(p0);
    }
    public final boolean contains(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof QMedia) {
          return this.contains(p0);
       }
       return false;
    }
    public final boolean getAutoFill(){
       return this.autoFill;
    }
    public final int getMaxSize(){
       return this.maxSize;
    }
    public final ArrayList getNotEmptyList(){
       ArrayList obj = PatchProxy.apply(null, this, SwapMediaArrayList.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.iterator();
       while (iterator.hasNext()) {
          QMedia qMedia = iterator.next();
          if (!qMedia instanceof EmptyQMedia) {
             obj.add(qMedia);
          }
       }
       return obj;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, SwapMediaArrayList.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public int indexOf(QMedia p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.indexOf(p0);
    }
    public final int indexOf(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 instanceof QMedia) {
          return this.indexOf(p0);
       }
       return -1;
    }
    public final int indexOfFirstEmpty(){
       Object obj = PatchProxy.apply(null, this, SwapMediaArrayList.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = this.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next() instanceof EmptyQMedia) {
             label_002e :
                if (i < 0) {
                   return this.size();
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_002e ;
          }
       }
       return i;
    }
    public int lastIndexOf(QMedia p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.lastIndexOf(p0);
    }
    public final int lastIndexOf(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 instanceof QMedia) {
          return this.lastIndexOf(p0);
       }
       return -1;
    }
    public final QMedia remove(int p0){
       if (PatchProxy.isSupport(SwapMediaArrayList.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SwapMediaArrayList.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.removeAt(p0);
    }
    public Object remove(int p0){
       return this.removeAt(p0);
    }
    public boolean remove(QMedia p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "element");
       if (this.autoFill == null) {
          return super.remove(p0);
       }
       boolean i = this.indexOf(p0);
       SwapMediaArrayList tmaxSize = this.maxSize;
       if (i >= 0 && tmaxSize > i) {
          this.set(i, new EmptyQMedia(0));
          i = true;
       }else {
          i = false;
       }
       this.b();
       "remove element:"+p0+", list:"+this.toString();
       return i;
    }
    public final boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof QMedia) {
          return this.remove(p0);
       }
       return false;
    }
    public boolean removeAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMediaArrayList.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       if (this.autoFill == null) {
          return super.removeAll(p0);
       }
       int i = 1;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i = i & this.remove(iterator.next());
       }
       this.b();
       "removeAll elements:"+p0+", list:"+this.toString();
       return i;
    }
    public QMedia removeAt(int p0){
       Object obj;
       if (PatchProxy.isSupport(SwapMediaArrayList.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SwapMediaArrayList.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.autoFill == null) {
          Object obj1 = super.remove(p0);
          a.o(obj1, "super.removeAt\(index\)");
          return obj1;
       }else if(p0 >= 0 && p0 < this.maxSize){
          obj = this.get(p0);
          a.o(obj, "get\(index\)");
          this.set(p0, new EmptyQMedia(0));
          this.b();
          this.toString();
          return obj;
       }else {
          throw new IndexOutOfBoundsException("Index: "+p0+", Size: "+this.size());
       }
    }
    public boolean removeIf(Predicate p0){
       a.p(p0, "filter");
       return super.removeIf(p0);
    }
    public void removeRange(int p0,int p1){
       super.removeRange(p0, p1);
    }
    public QMedia set(int p0,QMedia p1){
       StringBuilder obj;
       if (PatchProxy.isSupport(SwapMediaArrayList.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, SwapMediaArrayList.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "element");
       obj = "set index:"+p0+", element:"+p1+", maxSize:"+this.maxSize+", autoFill:"+this.autoFill;
       if (p0 >= this.maxSize) {
          return p1;
       }else {
          Object obj1 = super.set(p0, p1);
          a.o(obj1, "super.set\(index, element\)");
          return obj1;
       }
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public final void setAutoFill(boolean p0){
       this.autoFill = p0;
    }
    public final void setMaxSize(int p0){
       this.maxSize = p0;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, SwapMediaArrayList.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final int sizeOfNotEmpty(){
       Object obj = PatchProxy.apply(null, this, SwapMediaArrayList.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = this.iterator();
       while (iterator.hasNext()) {
          if (!iterator.next() instanceof EmptyQMedia) {
             i = i + 1;
          }
       }
       return i;
    }
}
