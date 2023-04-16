package com.kuaishou.viewbinder.ViewBinderOption;
import android.os.Parcelable;
import com.kuaishou.viewbinder.ViewBinderOption$a;
import nsd.u;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import c35.c;
import com.kuaishou.viewbinder.IViewBinder;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.viewbinder.ViewBinderFactoryConfig;

public final class ViewBinderOption implements Parcelable	// class@00119c
{
    public String b;
    public static final ViewBinderOption$a CREATOR;

    static {
       ViewBinderOption.CREATOR = new ViewBinderOption$a(null);
    }
    public void ViewBinderOption(){
       super(null);
    }
    public void ViewBinderOption(Parcel p0){
       a.p(p0, "parcel");
       super(p0.readString());
    }
    public void ViewBinderOption(String p0){
       super();
       this.b = p0;
    }
    public static IViewBinder c(ViewBinderOption p0,Class p1,c p2,int p3,int p4,Object p5){
       IViewBinder iViewBinder;
       if (p4 & 0x04) {
          p3 = -1;
       }
       if (PatchProxy.isSupport(ViewBinderOption.class)) {
          iViewBinder = PatchProxy.applyThreeRefs(p1, p2, Integer.valueOf(p3), p0, ViewBinderOption.class, "1");
          if (iViewBinder != PatchProxyResult.class) {
          label_002e :
             return iViewBinder;
          }
       }
       a.p(p1, "absClz");
       iViewBinder = ViewBinderFactoryConfig.getViewBinder(p0.b, p1, p2, p3);
       goto label_002e ;
    }
    public final String a(){
       return this.b;
    }
    public final IViewBinder b(Class p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ViewBinderOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewBinderOption.c(this, p0, p1, 0, 4, null);
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ViewBinderOption.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ViewBinderOption.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.b);
       return;
    }
}
