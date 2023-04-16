package com.ta.utdid2.b.a.a;
import org.xmlpull.v1.XmlSerializer;
import java.lang.String;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.StringBuilder;
import java.nio.Buffer;
import java.io.OutputStream;
import java.lang.System;
import java.lang.UnsupportedOperationException;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.nio.charset.CharsetEncoder;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.io.UnsupportedEncodingException;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;

public class a implements XmlSerializer	// class@000cc8
{
    public OutputStream a;
    public Writer a;
    public ByteBuffer a;
    public CharsetEncoder a;
    public final char[] a;
    public boolean e;
    public int mPos;
    public static String a = "xmlpull.org/v1/doc/features.html#indent-output";
    public static final String[] a;

    static {
       String[] stringArray = new String[]{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"&quot;",null,null,null,"&amp;",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"&lt;",null,"&gt;",null};
       a.a = stringArray;
    }
    public void a(){
       super();
       char[] uocharArray = new char[8192];
       this.a = uocharArray;
       this.a = ByteBuffer.allocate(8192);
    }
    public static String d(){
       return "http://"+a.a;
    }
    public final void a(){
       int i = this.a.position();
       if (i > 0) {
          this.a.flip();
          this.a.write(this.a.array(), 0, i);
          this.a.clear();
       }
       return;
    }
    public final void a(String p0){
       int i = p0.length();
       String[] a = a.a;
       char c = (char)a.length;
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          char c1 = p0.charAt(i1);
          if (c1 < c) {
             object oobject = a[c1];
             if (oobject != null) {
                if (i2 < i1) {
                   int i3 = i1 - i2;
                   this.a(p0, i2, i3);
                }
                i2 = i1 + 1;
                this.append(oobject);
             }
          }
          i1 = i1 + 1;
       }
       if (i2 < i1) {
          this.a(p0, i2, (i1 - i2));
       }
       return;
    }
    public final void a(String p0,int p1,int p2){
       int i = 8192;
       if (p2 > i) {
          p2 = p2 + p1;
          for (; p1 < p2; p1 = i1) {
             int i1 = p1 + 8192;
             int i2 = (i1 < p2)? 8192: p2 - p1;
             this.a(p0, p1, i2);
          }
          return;
       }else {
          a tmPos = this.mPos;
          if ((tmPos + p2) > i) {
             this.flush();
             tmPos = this.mPos;
          }
          p0.getChars(p1, (p1 + p2), this.a, tmPos);
          this.mPos = tmPos + p2;
          return;
       }
    }
    public final void a(char[] p0,int p1,int p2){
       String[] a = a.a;
       char c = (char)a.length;
       p2 = p2 + p1;
       int i = p1;
       while (p1 < p2) {
          char c1 = p0[p1];
          if (c1 < c) {
             object oobject = a[c1];
             if (oobject != null) {
                if (i < p1) {
                   int i1 = p1 - i;
                   this.append(p0, i, i1);
                }
                i = p1 + 1;
                this.append(oobject);
             }
          }
          p1++;
       }
       if (i < p1) {
          this.append(p0, i, (p1 - i));
       }
       return;
    }
    public final void append(char p0){
       a tmPos = this.mPos;
       if (tmPos >= 8191) {
          this.flush();
          tmPos = this.mPos;
       }
       this.a[tmPos] = p0;
       this.mPos = tmPos + 1;
       return;
    }
    public final void append(String p0){
       this.a(p0, 0, p0.length());
    }
    public final void append(char[] p0,int p1,int p2){
       int i = 8192;
       if (p2 > i) {
          p2 = p2 + p1;
          for (; p1 < p2; p1 = i1) {
             int i1 = p1 + 8192;
             int i2 = (i1 < p2)? 8192: p2 - p1;
             this.append(p0, p1, i2);
          }
          return;
       }else {
          a tmPos = this.mPos;
          if ((tmPos + p2) > i) {
             this.flush();
             tmPos = this.mPos;
          }
          System.arraycopy(p0, p1, this.a, tmPos, p2);
          this.mPos = tmPos + p2;
          return;
       }
    }
    public XmlSerializer attribute(String p0,String p1,String p2){
       this.append(' ');
       if (p0 != null) {
          this.append(p0);
          this.append(':');
       }
       this.append(p1);
       this.append("=\"");
       this.a(p2);
       this.append('"');
       return this;
    }
    public void cdsect(String p0){
       throw new UnsupportedOperationException();
    }
    public void comment(String p0){
       throw new UnsupportedOperationException();
    }
    public void docdecl(String p0){
       throw new UnsupportedOperationException();
    }
    public void endDocument(){
       this.flush();
    }
    public XmlSerializer endTag(String p0,String p1){
       if (this.e != null) {
          this.append(" />\n");
       }else {
          this.append("</");
          if (p0 != null) {
             this.append(p0);
             this.append(':');
          }
          this.append(p1);
          this.append(">\n");
       }
       this.e = false;
       return this;
    }
    public void entityRef(String p0){
       throw new UnsupportedOperationException();
    }
    public void flush(){
       a tmPos = this.mPos;
       if (tmPos > null) {
          if (this.a != null) {
             CharBuffer uCharBuffer = CharBuffer.wrap(this.a, 0, tmPos);
             CoderResult uCoderResult = this.a.encode(uCharBuffer, this.a, true);
             while (true) {
                if (uCoderResult.isError()) {
                   throw new IOException(uCoderResult.toString());
                }
                if (uCoderResult.isOverflow()) {
                   this.a();
                   uCoderResult = this.a.encode(uCharBuffer, this.a, true);
                }else {
                   this.a();
                   this.a.flush();
                }
             }
          }else {
             this.a.write(this.a, 0, tmPos);
             this.a.flush();
          }
          this.mPos = 0;
       }
       return;
    }
    public int getDepth(){
       throw new UnsupportedOperationException();
    }
    public boolean getFeature(String p0){
       throw new UnsupportedOperationException();
    }
    public String getName(){
       throw new UnsupportedOperationException();
    }
    public String getNamespace(){
       throw new UnsupportedOperationException();
    }
    public String getPrefix(String p0,boolean p1){
       throw new UnsupportedOperationException();
    }
    public Object getProperty(String p0){
       throw new UnsupportedOperationException();
    }
    public void ignorableWhitespace(String p0){
       throw new UnsupportedOperationException();
    }
    public void processingInstruction(String p0){
       throw new UnsupportedOperationException();
    }
    public void setFeature(String p0,boolean p1){
       if (p0.equals(a.d())) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public void setOutput(OutputStream p0,String p1){
       if (p0 == null) {
          throw new IllegalArgumentException();
       }
       try{
          this.a = Charset.forName(p1).newEncoder();
          this.a = p0;
          return;
       }catch(java.nio.charset.IllegalCharsetNameException e2){
          throw new UnsupportedEncodingException(p1).initCause(e2);
       }catch(java.nio.charset.UnsupportedCharsetException e2){
          throw new UnsupportedEncodingException(p1).initCause(e2);
       }
    }
    public void setOutput(Writer p0){
       this.a = p0;
    }
    public void setPrefix(String p0,String p1){
       throw new UnsupportedOperationException();
    }
    public void setProperty(String p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public void startDocument(String p0,Boolean p1){
       p0 = "<?xml version=\'1.0\' encoding=\'utf-8\' standalone=\'";
       String str = (p1.booleanValue())? "yes": "no";
       this.append(p0+str+"\' ?>\n");
       return;
    }
    public XmlSerializer startTag(String p0,String p1){
       if (this.e != null) {
          this.append(">\n");
       }
       this.append('<');
       if (p0 != null) {
          this.append(p0);
          this.append(':');
       }
       this.append(p1);
       this.e = true;
       return this;
    }
    public XmlSerializer text(String p0){
       if (this.e != null) {
          this.append(">");
          this.e = false;
       }
       this.a(p0);
       return this;
    }
    public XmlSerializer text(char[] p0,int p1,int p2){
       if (this.e != null) {
          this.append(">");
          this.e = false;
       }
       this.a(p0, p1, p2);
       return this;
    }
}
