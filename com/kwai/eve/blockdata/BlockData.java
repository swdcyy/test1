package com.kwai.eve.blockdata.BlockData;
import com.kwai.eve.blockdata.BlockData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.eve.blockdata.MetaInfo;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.Buffer;
import com.kwai.eve.blockdata.BlockDataException;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Integer;
import qrd.l1;
import ll5.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Float;

public final class BlockData	// class@000dca
{
    public int capacity;
    public ByteBuffer data;
    public MetaInfo meta;
    public long nativePtr;
    public int status;
    public static final BlockData$a Companion;

    static {
       BlockData.Companion = new BlockData$a(null);
    }
    public void BlockData(String p0,int p1,int[] p2,String p3){
       a.p(p0, "name");
       a.p(p2, "shape");
       a.p(p3, "extra");
       try{
          super();
          this.meta = new MetaInfo(p0, p1, p2, p3);
          long l = LuaNativeUtil.createCppBlockData(this, p0, p1, p2, p3);
          this.nativePtr = l;
          if (l - null > 0) {
             this.capacity = this.getCapacity();
             LuaNativeUtil.cppBlockDataRefCounterRetain(this.nativePtr);
             l = LuaNativeUtil.createDirectByteBuffer(this.nativePtr);
             Objects.requireNonNull(l, "null cannot be cast to non-null type java.nio.ByteBuffer");
             this.data = l;
             l.order(ByteOrder.nativeOrder());
             this.data.clear();
             this.status = 0;
             return;
          }else {
             this.status = (int)l;
             throw new BlockDataException("create CppBlockData fail£¬errorCode: "+this.status);
          }
       }catch(java.lang.Exception e2){
          this.status = -11004;
          throw e2;
       }
    }
    public void BlockData(String p0,int p1,int[] p2,String p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = "";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public void BlockData(String p0,ByteBuffer p1,long p2){
       super();
       this.meta = new MetaInfo(p0);
       this.data = p1;
       p1.order(ByteOrder.nativeOrder());
       this.capacity = this.getCapacity();
       this.nativePtr = p2;
       LuaNativeUtil.cppBlockDataRefCounterRetain(p2);
       this.status = this.meta.getStatus$luascriptcore_release();
    }
    public final void finalize(){
       if (PatchProxy.applyVoid(null, this, BlockData.class, "20")) {
          return;
       }
       StringBuilder str = "[kt] finalize start: "+this;
       BlockData tnativePtr = this.nativePtr;
       if (tnativePtr > 0) {
          LuaNativeUtil.cppBlockDataRefCounterRelease(tnativePtr);
          LuaNativeUtil.clearObjectMapping(this.nativePtr);
       }
       return;
    }
    public final int flatIndex(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockData.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       String str = 1;
       if (p0.length == str) {
          return p0[i];
       }
       if (p0.length != this.meta.getShape$luascriptcore_release().length) {
          throw new BlockDataException("param number¡¾"+p0.length+"¡¿ "+"isn\'t match with the shape array¡¾"+this.meta.getShape$luascriptcore_release().length+0x3011);
       }
       int len = p0.length;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             if (p0[i1] >= 0 && p0[i1] < this.meta.getShape$luascriptcore_release()[i1]) {
                i1 = i1 + 1;
             }else {
                break ;
             }
          }else {
             for (len = p0.length - str; len >= 0; len = len - 1) {
                i1 = p0[len] * str;
                i = i + i1;
                int i2 = str * this.meta.getShape$luascriptcore_release()[len];
             }
             return i;
          }
       }
       throw new BlockDataException("param index¡¾"+p0[i1]+"¡¿is invalid\(shape¡¾"+this.meta.getShape$luascriptcore_release()[i1]+"¡¿\)");
    }
    public final String formatOutput(){
       StringBuilder obj = PatchProxy.apply(null, this, BlockData.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 20;
       String str = "";
       int i1 = Math.min(this.capacity, i);
       for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
          str = str+this.data.get(i2)+' ';
       }
       String str1 = str;
       if (str1.length() >= i) {
          str = str;
          a.o(str, "build.toString\(\)");
          Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
          str = str.substring(0, 19);
          a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          obj = str;
          str1 = obj+"...";
       }
       a.o(str1, "build.toString\(\).let {\n ¡­tValue - 1\) + \"...\"\n    }");
       return str1;
    }
    public final void free(){
       if (PatchProxy.applyVoid(null, this, BlockData.class, "19")) {
          return;
       }
       Integer integer = Integer.valueOf(this.status);
       _monitor_enter(integer);
       if (this.status != null) {
          _monitor_exit(integer);
          return;
       }else {
          BlockData tnativePtr = this.nativePtr;
          if (tnativePtr > 0) {
             LuaNativeUtil.cppBlockDataRefCounterRelease(tnativePtr);
             this.status = -10004;
          }
          _monitor_exit(integer);
          return;
       }
    }
    public final byte getByte(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockData.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.byteValue();
       }
       a.p(p0, "elementIndexes");
       int i = this.flatIndex(p0);
       this.visitCheck(i, 1);
       return this.data.get((i * a.a(1)));
    }
    public final int getCapacity(){
       BlockData obj = PatchProxy.apply(null, this, BlockData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       int i1 = 0;
       obj = (!this.meta.getShape$luascriptcore_release().length)? 1: null;
       if (obj) {
          return i1;
       }else {
          int[] shape$luascr = this.meta.getShape$luascriptcore_release();
          ArrayList uArrayList = new ArrayList(shape$luascr.length);
          int len = shape$luascr.length;
          for (; i1 < len; i1 = i1 + 1) {
             i = i * shape$luascr[i1];
             uArrayList.add(l1.a);
          }
          return i;
       }
    }
    public final ByteBuffer getData(){
       return this.data;
    }
    public final double getDouble(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockData.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "elementIndexes");
       int i = this.flatIndex(p0);
       this.visitCheck(i, 4);
       return this.data.getDouble((i * a.a(4)));
    }
    public final String getExtra(){
       Object obj = PatchProxy.apply(null, this, BlockData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.meta.getExtra$luascriptcore_release();
    }
    public final float getFloat(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockData.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.p(p0, "elementIndexes");
       int i = this.flatIndex(p0);
       this.visitCheck(i, 3);
       return this.data.getFloat((i * a.a(3)));
    }
    public final int getInt(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockData.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "elementIndexes");
       int i = this.flatIndex(p0);
       this.visitCheck(i, 2);
       return this.data.getInt((i * a.a(2)));
    }
    public final String getMetaInfo(){
       Object obj = PatchProxy.apply(null, this, BlockData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.meta.getMetaInfo$luascriptcore_release();
    }
    public final String getName(){
       Object obj = PatchProxy.apply(null, this, BlockData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.meta.getName$luascriptcore_release();
    }
    public final long getNativePtr(){
       return this.nativePtr;
    }
    public final int[] getShape(){
       int[] obj = PatchProxy.apply(null, this, BlockData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.meta.getShape$luascriptcore_release();
       obj = Arrays.copyOf(obj, obj.length);
       a.o(obj, "java.util.Arrays.copyOf\(this, size\)");
       return obj;
    }
    public final int getType(){
       Object obj = PatchProxy.apply(null, this, BlockData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.meta.getType$luascriptcore_release();
    }
    public final void putByte(byte p0,int[] p1){
       BlockData uBlockData = BlockData.class;
       if (PatchProxy.isSupport(uBlockData) && PatchProxy.applyVoidTwoRefs(Byte.valueOf(p0), p1, this, uBlockData, "7")) {
          return;
       }
       a.p(p1, "elementIndexes");
       int i = this.flatIndex(p1);
       this.visitCheck(i, 1);
       this.data.put((i * a.a(1)), p0);
       return;
    }
    public final void putDouble(double p0,int[] p1){
       BlockData uBlockData = BlockData.class;
       if (PatchProxy.isSupport(uBlockData) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), p1, this, uBlockData, "10")) {
          return;
       }
       a.p(p1, "elementIndexes");
       int i = this.flatIndex(p1);
       this.visitCheck(i, 4);
       this.data.putDouble((i * a.a(4)), p0);
       return;
    }
    public final void putFloat(float p0,int[] p1){
       BlockData uBlockData = BlockData.class;
       if (PatchProxy.isSupport(uBlockData) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uBlockData, "9")) {
          return;
       }
       a.p(p1, "elementIndexes");
       int i = this.flatIndex(p1);
       this.visitCheck(i, 3);
       this.data.putFloat((i * a.a(3)), p0);
       return;
    }
    public final void putInt(int p0,int[] p1){
       BlockData uBlockData = BlockData.class;
       if (PatchProxy.isSupport(uBlockData) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBlockData, "8")) {
          return;
       }
       a.p(p1, "elementIndexes");
       int i = this.flatIndex(p1);
       this.visitCheck(i, 2);
       this.data.putInt((i * a.a(2)), p0);
       return;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, BlockData.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = ", ";
       obj = "BlockData\("+"status="+this.status+str+"meta="+this.getMetaInfo()+str+"nativeRetainNum=";
       BlockData tnativePtr = this.nativePtr;
       int retainNum = (tnativePtr > 0)? LuaNativeUtil.getRetainNum(tnativePtr): 0;
       return obj+retainNum+str+"data=[ "+this.formatOutput()+"], "+"capacity="+this.capacity+')';
    }
    public final void visitCheck(int p0,int p1){
       BlockData uBlockData = BlockData.class;
       if (PatchProxy.isSupport(uBlockData) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uBlockData, "16")) {
          return;
       }
       if (this.status != null) {
          throw new BlockDataException("BlockData status error: "+this.status);
       }
       if (p0 < 0 || p0 >= this.capacity) {
          throw new BlockDataException("BlockData visit index["+p0+"] invalid");
       }
       if (p1 == this.meta.getType$luascriptcore_release()) {
          return;
       }
       throw new BlockDataException("BlockData visit dataType["+p1+"] invalid");
    }
}
