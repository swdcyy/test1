package com.kwai.video.aemonplayer.JavaAttrList;
import java.lang.Object;
import com.kwai.video.aemonplayer.JavaAttrListJNI;
import com.kwai.video.aemonplayer.AemonHotfix;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.util.HashMap;

public class JavaAttrList	// class@0019cb
{
    public final JavaAttrListJNI mJni;
    public long mPointer;
    public static HashMap codeMap;

    public void JavaAttrList(int p0){
       super();
       JavaAttrListJNI javaAttrList = AemonHotfix.CreateJavaAttrListJNI(p0);
       this.mJni = javaAttrList;
       this.mPointer = javaAttrList.native_Create();
    }
    public void Destroy(){
       if (PatchProxy.applyVoid(null, this, JavaAttrList.class, "2")) {
          return;
       }
       JavaAttrList tmPointer = this.mPointer;
       if (tmPointer) {
          this.mJni.native_Destory(tmPointer);
          this.mPointer = 0;
       }
       return;
    }
    public byte[] GetByteBufferValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaAttrList.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          return this.mJni.native_GetByteBufferValue(this.mPointer, p0);
       }
       return this.mJni.native_GetByteBufferValueByCode(this.mPointer, stringCode);
    }
    public float GetFloatValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaAttrList.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          return this.mJni.native_GetFloatValue(this.mPointer, p0);
       }
       return this.mJni.native_GetFloatValueByCode(this.mPointer, stringCode);
    }
    public int GetIntValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaAttrList.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          return this.mJni.native_GetIntValue(this.mPointer, p0);
       }
       return this.mJni.native_GetIntValueByCode(this.mPointer, stringCode);
    }
    public long GetLongValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaAttrList.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          return this.mJni.native_GetLongValue(this.mPointer, p0);
       }
       return this.mJni.native_GetLongValueByCode(this.mPointer, stringCode);
    }
    public Object GetObjectValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaAttrList.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          return this.mJni.native_GetObjectValue(this.mPointer, p0);
       }
       return this.mJni.native_GetObjectValueByCode(this.mPointer, stringCode);
    }
    public String GetStringValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JavaAttrList.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          return this.mJni.native_GetStringValue(this.mPointer, p0);
       }
       return this.mJni.native_GetStringValueByCode(this.mPointer, stringCode);
    }
    public void SetByteBufferValue(String p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JavaAttrList.class, "14")) {
          return;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          this.mJni.native_SetByteBufferValue(this.mPointer, p0, p1);
       }else {
          this.mJni.native_SetByteBufferValueByCode(this.mPointer, stringCode, p1);
       }
       return;
    }
    public void SetFloatValue(String p0,float p1){
       JavaAttrList javaAttrList = JavaAttrList.class;
       if (PatchProxy.isSupport(javaAttrList) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, javaAttrList, "6")) {
          return;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          this.mJni.native_SetFloatValue(this.mPointer, p0, p1);
       }else {
          this.mJni.native_SetFloatValueByCode(this.mPointer, stringCode, p1);
       }
       return;
    }
    public void SetIntValue(String p0,int p1){
       JavaAttrList javaAttrList = JavaAttrList.class;
       if (PatchProxy.isSupport(javaAttrList) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, javaAttrList, "4")) {
          return;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          this.mJni.native_SetIntValue(this.mPointer, p0, p1);
       }else {
          this.mJni.native_SetIntValueByCode(this.mPointer, stringCode, p1);
       }
       return;
    }
    public void SetLongValue(String p0,long p1){
       JavaAttrList javaAttrList = JavaAttrList.class;
       if (PatchProxy.isSupport(javaAttrList) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, javaAttrList, "5")) {
          return;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          this.mJni.native_SetInt64Value(this.mPointer, p0, p1);
       }else {
          this.mJni.native_SetInt64ValueByCode(this.mPointer, stringCode, p1);
       }
       return;
    }
    public void SetObjectValue(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JavaAttrList.class, "8")) {
          return;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          this.mJni.native_SetObjectValue(this.mPointer, p0, p1);
       }else {
          this.mJni.native_SetObjectValueByCode(this.mPointer, stringCode, p1);
       }
       return;
    }
    public void SetStringValue(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JavaAttrList.class, "7")) {
          return;
       }
       long stringCode = this.getStringCode(p0);
       if (!stringCode - -1) {
          this.mJni.native_SetStringValue(this.mPointer, p0, p1);
       }else {
          this.mJni.native_SetStringValueByCode(this.mPointer, stringCode, p1);
       }
       return;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, JavaAttrList.class, "3")) {
          return;
       }
       super.finalize();
       JavaAttrList tmPointer = this.mPointer;
       if (tmPointer) {
          this.mJni.native_Destory(tmPointer);
          this.mPointer = 0;
       }
       return;
    }
    public final long getStringCode(String p0){
       JavaAttrList javaAttrList = JavaAttrList.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, javaAttrList, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (JavaAttrList.codeMap == null) {
          _monitor_enter(javaAttrList);
          if (JavaAttrList.codeMap == null) {
             JavaAttrList.codeMap = this.mJni.native_GetStringCodeMap();
          }
          _monitor_exit(javaAttrList);
       }
       HashMap codeMap = JavaAttrList.codeMap;
       if (codeMap != null && codeMap.containsKey(p0)) {
          return JavaAttrList.codeMap.get(p0).longValue();
       }else {
          return -1;
       }
    }
}
