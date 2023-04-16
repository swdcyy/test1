package com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$a;
import java.lang.Object;
import nsd.u;
import android.os.Bundle;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.model.LaunchModel$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import zf6.k;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Parcelable;

public final class KtvTuneKrnFragment$a	// class@000ff6
{

    public void KtvTuneKrnFragment$a(){
       super();
    }
    public void KtvTuneKrnFragment$a(u p0){
       super();
    }
    public static Bundle b(KtvTuneKrnFragment$a p0,Bundle p1,String p2,boolean p3,String p4,boolean p5,int p6,Object p7){
       if (p6 & 0x01) {
          p1 = new Bundle();
       }
       if (p6 & 0x02) {
          p2 = "recommend";
       }
       p7 = p2;
       int i = (p6 & 0x04)? 1: p3;
       if (p6 & 0x08) {
          p4 = "";
       }
       String str = p4;
       int i1 = (p6 & 0x10)? 0: p5;
       return p0.a(p1, p7, i, str, i1);
    }
    public final Bundle a(Bundle p0,String p1,boolean p2,String p3,boolean p4){
       KtvTuneKrnFragment$a uoa = KtvTuneKrnFragment$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "defaultSelectTab");
       a.p(p3, "extParams");
       LaunchModel$b uob = new LaunchModel$b();
       uob.i("KMusicRefactor");
       uob.j("kmusic");
       LaunchModel$b uob1 = uob.e("minBundleVersion", "143").b("themeStyle", p2).b("index", (TextUtils.equals(p1, "recommend") ^ 1));
       String str = (p4 && !k.d())? "#FFFFFF": "#19191E";
       uob1 = uob1.e("bgColor", str).f("enableBackBtnHandler", 1).e("containerSource", "KtvTuneKrnFragment");
       if (p3.length() > 0) {
          i = 1;
       }
       if (i) {
          uob1.e("extParams", p3);
       }
       if (p4) {
          uob1.e("from", "music_library");
       }
       p0.putParcelable("rn_launch_model", uob1.h());
       return p0;
    }
}
