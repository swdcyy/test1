package com.kuaishou.krn.model.LaunchModel;
import android.os.Parcelable;
import com.kuaishou.krn.model.LaunchModel$a;
import android.os.Parcel;
import java.lang.Object;
import com.kuaishou.krn.model.PluginTrackInfo;
import java.lang.Math;
import java.lang.String;
import android.os.Bundle;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Enum;

public class LaunchModel implements Parcelable	// class@000903
{
    public String b;
    public String c;
    public Bundle d;
    public String e;
    public Integer f;
    public String g;
    public String h;
    public Boolean i;
    public boolean j;
    public JsFramework k;
    public PluginTrackInfo l;
    public double m;
    public static final Parcelable$Creator CREATOR;

    static {
       LaunchModel.CREATOR = new LaunchModel$a();
    }
    public void LaunchModel(Parcel p0){
       super();
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.l = new PluginTrackInfo();
       this.m = Math.random();
       this.e = p0.readString();
       this.c = p0.readString();
       this.b = p0.readString();
       this.d = p0.readBundle();
       boolean b = (p0.readInt())? true: false;
       this.j = b;
       this.k = JsFramework.values()[p0.readInt()];
       this.l = p0.readParcelable(LaunchModel.class.getClassLoader());
       this.m = p0.readDouble();
       return;
    }
    public void LaunchModel(LaunchModel$b p0){
       super();
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.l = new PluginTrackInfo();
       this.m = Math.random();
       this.e = p0.a;
       this.c = p0.b;
       this.b = p0.c;
       this.d = p0.d;
       this.j = p0.e;
       this.k = p0.f;
    }
    public String a(){
       return this.e;
    }
    public String b(){
       return this.c;
    }
    public String c(){
       LaunchModel obj = PatchProxy.apply(null, this, LaunchModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          String str = obj.getString("degradeWebUrl", "");
          if (!TextUtils.isEmpty(str)) {
             return str;
          }
       }
       return "";
    }
    public JsFramework d(){
       return this.k;
    }
    public int describeContents(){
       return 0;
    }
    public String e(){
       LaunchModel obj = PatchProxy.apply(null, this, LaunchModel.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          return obj.getString("bgColor", "");
       }
       return "";
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, LaunchModel.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getString("krnUri", "");
    }
    public Bundle g(){
       return this.d;
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, LaunchModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          this.g = this.d.getString("minAppVersion", "");
       }
       return this.g;
    }
    public int i(){
       LaunchModel obj = PatchProxy.apply(null, this, LaunchModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       if (obj != null) {
          return obj.intValue();
       }
       int i = -1;
       Object obj1 = this.d.get("minBundleVersion");
       this.f = (obj1 == null)? Integer.valueOf(i): Integer.valueOf(Integer.parseInt(obj1.toString()));
    label_0044 :
       return this.f.intValue();
    }
    public PluginTrackInfo j(){
       Object obj = PatchProxy.apply(null, this, LaunchModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = new PluginTrackInfo();
       }
       return this.l;
    }
    public String k(){
       Object obj = PatchProxy.apply(null, this, LaunchModel.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getString("pushOrientation", "default");
    }
    public double l(){
       return this.m;
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, LaunchModel.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getString("themeStyle", "0");
    }
    public boolean n(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LaunchModel obj = PatchProxy.apply(null, this, LaunchModel.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj == null || TextUtils.isEmpty(obj.trim())) {
          Object obj1 = PatchProxy.apply(null, this, LaunchModel.class, "21");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): this.d.getBoolean("showTopBar", b);
          if (!b1) {
          label_003f :
             return b;
          }
       }
       b = true;
       goto label_003f ;
    }
    public final boolean o(String p0,boolean p1){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, LaunchModel.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = this.d.get(p0);
       if (p0 instanceof String) {
          boolean b = (Boolean.parseBoolean(p0) || TextUtils.equals(p0, "1"))? true: false;
          return b;
       }else if(p0 instanceof Boolean){
          return p0.booleanValue();
       }else {
          return p1;
       }
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, LaunchModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.o("enableShowError", true) ^ true);
    }
    public void t(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LaunchModel.class, "2")) {
          return;
       }
       if (this.d == null) {
          this.d = new Bundle();
       }
       this.d.putAll(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LaunchModel.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LaunchModel{mBundleId="+this.e+", mComponentName="+this.c+", mTitle="+this.b+", mLaunchOptions="+this.d+", mAutoPageShow="+this.j+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "26")) {
          return;
       }
       p0.writeString(this.e);
       p0.writeString(this.c);
       p0.writeString(this.b);
       p0.writeBundle(this.d);
       p0.writeInt(this.j);
       p0.writeInt(this.k.ordinal());
       p0.writeParcelable(this.l, p1);
       p0.writeDouble(this.m);
       return;
    }
}
