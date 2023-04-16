package com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import jq4.a;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.i1;

public final class MoodTemplateUiData extends MoodTemplateData	// class@000b36
{
    public a v;

    public void MoodTemplateUiData(MoodTemplateData p0){
       a.p(p0, "moodTemplateData");
       super(null, null, null, null, null, null, p0.w(), 0, 0, 0, null, null, null, null, null, 0, 0, 0, 0, false, 0xfffbf, null);
       String this = p0.n();
       String str = this;
       String str1 = "<set-?>";
       if (PatchProxy.applyVoidOneRefs(this, str, MoodTemplateData.class, "2")) {
       }else {
          a.p(this, str1);
          str.b = this;
       }
       this = p0.o();
       if (!PatchProxy.applyVoidOneRefs(this, str, MoodTemplateData.class, "3")) {
          a.p(this, str1);
          str.c = this;
       }
       List this1 = p0.t();
       if (!PatchProxy.applyVoidOneRefs(this1, str, MoodTemplateData.class, "4")) {
          a.p(this1, str1);
          str.d = this1;
       }
       this1 = p0.m();
       if (!PatchProxy.applyVoidOneRefs(this1, str, MoodTemplateData.class, "5")) {
          a.p(this1, str1);
          str.e = this1;
       }
       str.E(p0.q());
       str.D(p0.k());
       str.h = p0.w();
       str.i = p0.f();
       str.j = p0.g();
       str.A(p0.h());
       this = p0.b();
       if (!PatchProxy.applyVoidOneRefs(this, str, MoodTemplateData.class, "9")) {
          a.p(this, str1);
          str.m = this;
       }
       str.C(p0.j());
       str.r = p0.c();
       this = p0.d();
       if (!PatchProxy.applyVoidOneRefs(this, str, MoodTemplateData.class, "11")) {
          a.p(this, str1);
          str.p = this;
       }
       str.z(p0.e());
       str.q = p0.a();
       str.s = p0.l();
       str.B(p0.i());
       str.y(p0.x());
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateUiData", "init type:"+this.w()+", pureMoodBackgroundColorData:"+str.v, objArray);
       return;
    }
    public final a F(){
       String str = "MoodTemplateUiData";
       Object obj = PatchProxy.apply(null, this, MoodTemplateUiData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.v == null && !this.w()) {
          try{
             this.v = new Gson().h(this.b(), a.class);
          }catch(org.json.JSONException e1){
             a.D().z(str, "getPureMoodBackgroundColorData JSONException: ", e1);
             i1.c(e1);
          }catch(java.lang.Exception e1){
             PostUtils.D(str, "getPureMoodBackgroundColorData: ", e1);
             i1.c(e1);
          }
       }
    }
}
