package com.google.protobuf.ByteString;
import java.lang.Iterable;
import java.io.Serializable;
import com.google.protobuf.ByteString$LiteralByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.Android;
import com.google.protobuf.ByteString$SystemByteArrayCopier;
import com.google.protobuf.ByteString$1;
import com.google.protobuf.ByteString$ArraysByteArrayCopier;
import com.google.protobuf.ByteString$2;
import java.lang.Object;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.IndexOutOfBoundsException;
import java.util.Collection;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import com.google.protobuf.ByteString$ByteArrayCopier;
import com.google.protobuf.ByteString$CodedBuilder;
import com.google.protobuf.ByteString$Output;
import java.io.InputStream;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Comparator;
import com.google.protobuf.NioByteString;
import com.google.protobuf.ByteString$BoundedByteString;
import java.util.List;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.ByteString$ByteIterator;
import com.google.protobuf.CodedInputStream;
import java.util.Locale;
import java.lang.System;
import java.io.UnsupportedEncodingException;
import java.lang.Throwable;
import com.google.protobuf.TextFormatEscaper;
import com.google.protobuf.ByteOutput;
import java.io.OutputStream;

public abstract class ByteString implements Iterable, Serializable	// class@0003d6
{
    public int hash;
    public static final ByteString EMPTY;
    public static final Comparator UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    public static final ByteString$ByteArrayCopier byteArrayCopier;

    static {
       ByteString.EMPTY = new ByteString$LiteralByteString(Internal.EMPTY_BYTE_ARRAY);
       ByteString$SystemByteArrayCopier systemByteAr = (Android.isOnAndroidDevice())? new ByteString$SystemByteArrayCopier(null): new ByteString$ArraysByteArrayCopier(null);
       ByteString.byteArrayCopier = systemByteAr;
       ByteString.UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new ByteString$2();
    }
    public void ByteString(){
       super();
       this.hash = 0;
    }
    public static ByteString balancedConcat(Iterator p0,int p1){
       ByteString uByteString;
       int i = 1;
       if (p1 >= i) {
          if (p1 == i) {
             uByteString = p0.next();
          }else {
             i = p1 >> 1;
             uByteString = ByteString.balancedConcat(p0, i).concat(ByteString.balancedConcat(p0, (p1 - i)));
          }
          return uByteString;
       }else {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p1);
          throw new IllegalArgumentException(String.format("length \(%s\) must be >= 1", objArray));
       }
    }
    public static void checkIndex(int p0,int p1){
       if (((p1 - (p0 + 1)) | p0) >= 0) {
          return;
       }
       if (p0 < 0) {
          throw new ArrayIndexOutOfBoundsException("Index < 0: "+p0);
       }
       throw new ArrayIndexOutOfBoundsException("Index > length: "+p0+", "+p1);
    }
    public static int checkRange(int p0,int p1,int p2){
       int i = p1 - p0;
       if ((((p0 | p1) | i) | (p2 - p1)) >= 0) {
          return i;
       }
       if (p0 < 0) {
          throw new IndexOutOfBoundsException("Beginning index: "+p0+" < 0");
       }
       if (p1 < p0) {
          throw new IndexOutOfBoundsException("Beginning index larger than ending index: "+p0+", "+p1);
       }
       throw new IndexOutOfBoundsException("End index: "+p1+" >= "+p2);
    }
    public static ByteString copyFrom(Iterable p0){
       int i;
       if (!p0 instanceof Collection) {
          i = 0;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             iterator.next();
             i = i + 1;
          }
       }else {
          i = p0.size();
       }
       if (!i) {
          return ByteString.EMPTY;
       }else {
          return ByteString.balancedConcat(p0.iterator(), i);
       }
    }
    public static ByteString copyFrom(String p0,String p1){
       return new ByteString$LiteralByteString(p0.getBytes(p1));
    }
    public static ByteString copyFrom(String p0,Charset p1){
       return new ByteString$LiteralByteString(p0.getBytes(p1));
    }
    public static ByteString copyFrom(ByteBuffer p0){
       return ByteString.copyFrom(p0, p0.remaining());
    }
    public static ByteString copyFrom(ByteBuffer p0,int p1){
       ByteString.checkRange(0, p1, p0.remaining());
       byte[] uobyteArray = new byte[p1];
       p0.get(uobyteArray);
       return new ByteString$LiteralByteString(uobyteArray);
    }
    public static ByteString copyFrom(byte[] p0){
       return ByteString.copyFrom(p0, 0, p0.length);
    }
    public static ByteString copyFrom(byte[] p0,int p1,int p2){
       ByteString.checkRange(p1, (p1 + p2), p0.length);
       return new ByteString$LiteralByteString(ByteString.byteArrayCopier.copyFrom(p0, p1, p2));
    }
    public static ByteString copyFromUtf8(String p0){
       return new ByteString$LiteralByteString(p0.getBytes(Internal.UTF_8));
    }
    public static ByteString$CodedBuilder newCodedBuilder(int p0){
       return new ByteString$CodedBuilder(p0, null);
    }
    public static ByteString$Output newOutput(){
       return new ByteString$Output(128);
    }
    public static ByteString$Output newOutput(int p0){
       return new ByteString$Output(p0);
    }
    public static ByteString readChunk(InputStream p0,int p1){
       byte[] uobyteArray = new byte[p1];
       int i = 0;
       while (i < p1) {
          int i1 = p1 - i;
          i1 = p0.read(uobyteArray, i, i1);
          if (i1 == -1) {
             break ;
          }else {
             i = i + i1;
          }
       }
       if (!i) {
          return null;
       }
       return ByteString.copyFrom(uobyteArray, 0, i);
    }
    public static ByteString readFrom(InputStream p0){
       return ByteString.readFrom(p0, 256, 8192);
    }
    public static ByteString readFrom(InputStream p0,int p1){
       return ByteString.readFrom(p0, p1, p1);
    }
    public static ByteString readFrom(InputStream p0,int p1,int p2){
       ArrayList uArrayList = new ArrayList();
       ByteString uByteString = ByteString.readChunk(p0, p1);
       while (uByteString != null) {
          uArrayList.add(uByteString);
          p1 = p1 * 2;
          p1 = Math.min(p1, p2);
       }
       return ByteString.copyFrom(uArrayList);
    }
    public static int toInt(byte p0){
       return (p0 & 0x00ff);
    }
    public static Comparator unsignedLexicographicalComparator(){
       return ByteString.UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }
    public static ByteString wrap(ByteBuffer p0){
       if (p0.hasArray()) {
          return ByteString.wrap(p0.array(), (p0.arrayOffset() + p0.position()), p0.remaining());
       }
       return new NioByteString(p0);
    }
    public static ByteString wrap(byte[] p0){
       return new ByteString$LiteralByteString(p0);
    }
    public static ByteString wrap(byte[] p0,int p1,int p2){
       return new ByteString$BoundedByteString(p0, p1, p2);
    }
    public abstract ByteBuffer asReadOnlyByteBuffer();
    public abstract List asReadOnlyByteBufferList();
    public abstract byte byteAt(int p0);
    public final ByteString concat(ByteString p0){
       if ((Integer.MAX_VALUE - this.size()) >= p0.size()) {
          return RopeByteString.concatenate(this, p0);
       }
       throw new IllegalArgumentException("ByteString would be too long: "+this.size()+"+"+p0.size());
    }
    public abstract void copyTo(ByteBuffer p0);
    public void copyTo(byte[] p0,int p1){
       this.copyTo(p0, 0, p1, this.size());
    }
    public final void copyTo(byte[] p0,int p1,int p2,int p3){
       ByteString.checkRange(p1, (p1 + p3), this.size());
       ByteString.checkRange(p2, (p2 + p3), p0.length);
       if (p3 > 0) {
          this.copyToInternal(p0, p1, p2, p3);
       }
       return;
    }
    public abstract void copyToInternal(byte[] p0,int p1,int p2,int p3);
    public final boolean endsWith(ByteString p0){
       boolean b = (this.size() >= p0.size() && this.substring((this.size() - p0.size())).equals(p0))? true: false;
       return b;
    }
    public abstract boolean equals(Object p0);
    public abstract int getTreeDepth();
    public final int hashCode(){
       ByteString thash = this.hash;
       if (thash == null) {
          thash = this.partialHash(this.size(), 0, this.size());
          if (!thash) {
             thash = 1;
          }
          this.hash = thash;
       }
       return thash;
    }
    public abstract byte internalByteAt(int p0);
    public abstract boolean isBalanced();
    public final boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public abstract boolean isValidUtf8();
    public ByteString$ByteIterator iterator(){
       return new ByteString$1(this);
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public abstract CodedInputStream newCodedInput();
    public abstract InputStream newInput();
    public abstract int partialHash(int p0,int p1,int p2);
    public abstract int partialIsValidUtf8(int p0,int p1,int p2);
    public final int peekCachedHashCode(){
       return this.hash;
    }
    public abstract int size();
    public final boolean startsWith(ByteString p0){
       int i = 0;
       if (this.size() >= p0.size() && this.substring(i, p0.size()).equals(p0)) {
          i = true;
       }
       return i;
    }
    public final ByteString substring(int p0){
       return this.substring(p0, this.size());
    }
    public abstract ByteString substring(int p0,int p1);
    public final byte[] toByteArray(){
       int i = this.size();
       if (!i) {
          return Internal.EMPTY_BYTE_ARRAY;
       }
       byte[] uobyteArray = new byte[i];
       this.copyToInternal(uobyteArray, 0, 0, i);
       return uobyteArray;
    }
    public final String toString(){
       Object[] objArray = new Object[]{Integer.toHexString(System.identityHashCode(this)),Integer.valueOf(this.size()),this.truncateAndEscapeForDisplay()};
       return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", objArray);
    }
    public final String toString(String p0){
       try{
          return this.toString(Charset.forName(p0));
       }catch(java.nio.charset.UnsupportedCharsetException e0){
          UnsupportedEncodingException unsupportedE = new UnsupportedEncodingException(p0);
          unsupportedE.initCause(e0);
          throw unsupportedE;
       }
    }
    public final String toString(Charset p0){
       String str = (!this.size())? "": this.toStringInternal(p0);
       return str;
    }
    public abstract String toStringInternal(Charset p0);
    public final String toStringUtf8(){
       return this.toString(Internal.UTF_8);
    }
    public final String truncateAndEscapeForDisplay(){
       String str = (this.size() <= 50)? TextFormatEscaper.escapeBytes(this): TextFormatEscaper.escapeBytes(this.substring(0, 47))+"...";
       return str;
    }
    public abstract void writeTo(ByteOutput p0);
    public abstract void writeTo(OutputStream p0);
    public final void writeTo(OutputStream p0,int p1,int p2){
       ByteString.checkRange(p1, (p1 + p2), this.size());
       if (p2 > 0) {
          this.writeToInternal(p0, p1, p2);
       }
       return;
    }
    public abstract void writeToInternal(OutputStream p0,int p1,int p2);
    public abstract void writeToReverse(ByteOutput p0);
}
