package com.kwai.video.aemonplayer.JavaAttrListJNIBuiltIn;
import com.kwai.video.aemonplayer.JavaAttrListJNI;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.lang.Float;
import java.lang.Integer;

public class JavaAttrListJNIBuiltIn extends JavaAttrListJNI	// class@0019cd
{

    public void JavaAttrListJNIBuiltIn(){
       super();
    }
    public static native HashMap _native_GetStringCodeMap();
    public native final long _native_Create();
    public native final void _native_Destory(long p0);
    public native final byte[] _native_GetByteArrayValue(long p0,String p1);
    public native final byte[] _native_GetByteArrayValueByCode(long p0,long p1);
    public native final byte[] _native_GetByteBufferValue(long p0,String p1);
    public native final byte[] _native_GetByteBufferValueByCode(long p0,long p1);
    public native final float _native_GetFloatValue(long p0,String p1);
    public native final float _native_GetFloatValueByCode(long p0,long p1);
    public native final int _native_GetIntValue(long p0,String p1);
    public native final int _native_GetIntValueByCode(long p0,long p1);
    public native final long _native_GetLongValue(long p0,String p1);
    public native final long _native_GetLongValueByCode(long p0,long p1);
    public native final Object _native_GetObjectValue(long p0,String p1);
    public native final Object _native_GetObjectValueByCode(long p0,long p1);
    public native final String _native_GetStringValue(long p0,String p1);
    public native final String _native_GetStringValueByCode(long p0,long p1);
    public native final void _native_SetByteBufferValue(long p0,String p1,byte[] p2);
    public native final void _native_SetByteBufferValueByCode(long p0,long p1,byte[] p2);
    public native final void _native_SetFloatValue(long p0,String p1,float p2);
    public native final void _native_SetFloatValueByCode(long p0,long p1,float p2);
    public native final void _native_SetInt64Value(long p0,String p1,long p2);
    public native final void _native_SetInt64ValueByCode(long p0,long p1,long p2);
    public native final void _native_SetIntValue(long p0,String p1,int p2);
    public native final void _native_SetIntValueByCode(long p0,long p1,int p2);
    public native final void _native_SetObjectValue(long p0,String p1,Object p2);
    public native final void _native_SetObjectValueByCode(long p0,long p1,Object p2);
    public native final void _native_SetStringValue(long p0,String p1,String p2);
    public native final void _native_SetStringValueByCode(long p0,long p1,String p2);
    public long native_Create(){
       Object obj = PatchProxy.apply(null, this, JavaAttrListJNIBuiltIn.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._native_Create();
    }
    public void native_Destory(long p0){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, javaAttrList, "2")) {
          return;
       }
       this._native_Destory(p0);
       return;
    }
    public byte[] native_GetByteArrayValue(long p0,String p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, javaAttrList, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetByteArrayValue(p0, p1);
    }
    public byte[] native_GetByteArrayValueByCode(long p0,long p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, javaAttrList, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetByteArrayValueByCode(p0, p1);
    }
    public byte[] native_GetByteBufferValue(long p0,String p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, javaAttrList, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetByteBufferValue(p0, p1);
    }
    public byte[] native_GetByteBufferValueByCode(long p0,long p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, javaAttrList, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetByteBufferValueByCode(p0, p1);
    }
    public float native_GetFloatValue(long p0,String p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, javaAttrList, "10");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this._native_GetFloatValue(p0, p1);
    }
    public float native_GetFloatValueByCode(long p0,long p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, javaAttrList, "22");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this._native_GetFloatValueByCode(p0, p1);
    }
    public int native_GetIntValue(long p0,String p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, javaAttrList, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_GetIntValue(p0, p1);
    }
    public int native_GetIntValueByCode(long p0,long p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, javaAttrList, "20");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_GetIntValueByCode(p0, p1);
    }
    public long native_GetLongValue(long p0,String p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, javaAttrList, "9");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._native_GetLongValue(p0, p1);
    }
    public long native_GetLongValueByCode(long p0,long p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, javaAttrList, "21");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._native_GetLongValueByCode(p0, p1);
    }
    public Object native_GetObjectValue(long p0,String p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, javaAttrList, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetObjectValue(p0, p1);
    }
    public Object native_GetObjectValueByCode(long p0,long p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, javaAttrList, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetObjectValueByCode(p0, p1);
    }
    public HashMap native_GetStringCodeMap(){
       Object obj = PatchProxy.apply(null, this, JavaAttrListJNIBuiltIn.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaAttrListJNIBuiltIn._native_GetStringCodeMap();
    }
    public String native_GetStringValue(long p0,String p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, javaAttrList, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetStringValue(p0, p1);
    }
    public String native_GetStringValueByCode(long p0,long p1){
       JavaAttrListJNIBuiltIn javaAttrList = JavaAttrListJNIBuiltIn.class;
       if (PatchProxy.isSupport(javaAttrList)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, javaAttrList, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_GetStringValueByCode(p0, p1);
    }
    public void native_SetByteBufferValue(long p0,String p1,byte[] p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, JavaAttrListJNIBuiltIn.class, "25")) {
          return;
       }
       this._native_SetByteBufferValue(p0, p1, p2);
       return;
    }
    public void native_SetByteBufferValueByCode(long p0,long p1,byte[] p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, JavaAttrListJNIBuiltIn.class, "26")) {
          return;
       }
       this._native_SetByteBufferValueByCode(p0, p1, p2);
       return;
    }
    public void native_SetFloatValue(long p0,String p1,float p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Float.valueOf(p2), this, JavaAttrListJNIBuiltIn.class, "5")) {
          return;
       }
       this._native_SetFloatValue(p0, p1, p2);
       return;
    }
    public void native_SetFloatValueByCode(long p0,long p1,float p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Float.valueOf(p2), this, JavaAttrListJNIBuiltIn.class, "17")) {
          return;
       }
       this._native_SetFloatValueByCode(p0, p1, p2);
       return;
    }
    public void native_SetInt64Value(long p0,String p1,long p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Long.valueOf(p2), this, JavaAttrListJNIBuiltIn.class, "4")) {
          return;
       }
       this._native_SetInt64Value(p0, p1, p2);
       return;
    }
    public void native_SetInt64ValueByCode(long p0,long p1,long p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, JavaAttrListJNIBuiltIn.class, "16")) {
          return;
       }
       this._native_SetInt64ValueByCode(p0, p1, p2);
       return;
    }
    public void native_SetIntValue(long p0,String p1,int p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, JavaAttrListJNIBuiltIn.class, "3")) {
          return;
       }
       this._native_SetIntValue(p0, p1, p2);
       return;
    }
    public void native_SetIntValueByCode(long p0,long p1,int p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, JavaAttrListJNIBuiltIn.class, "15")) {
          return;
       }
       this._native_SetIntValueByCode(p0, p1, p2);
       return;
    }
    public void native_SetObjectValue(long p0,String p1,Object p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, JavaAttrListJNIBuiltIn.class, "7")) {
          return;
       }
       this._native_SetObjectValue(p0, p1, p2);
       return;
    }
    public void native_SetObjectValueByCode(long p0,long p1,Object p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, JavaAttrListJNIBuiltIn.class, "19")) {
          return;
       }
       this._native_SetObjectValueByCode(p0, p1, p2);
       return;
    }
    public void native_SetStringValue(long p0,String p1,String p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, JavaAttrListJNIBuiltIn.class, "6")) {
          return;
       }
       this._native_SetStringValue(p0, p1, p2);
       return;
    }
    public void native_SetStringValueByCode(long p0,long p1,String p2){
       if (PatchProxy.isSupport(JavaAttrListJNIBuiltIn.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, JavaAttrListJNIBuiltIn.class, "18")) {
          return;
       }
       this._native_SetStringValueByCode(p0, p1, p2);
       return;
    }
}
