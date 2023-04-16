package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$o;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.String;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo;
import h69.g;
import java.lang.StringBuilder;
import o69.c;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import l69.t;
import java.util.Objects;

public final class VideoTemplateProject$o implements o	// class@001994
{
    public final VideoTemplateProject b;
    public final boolean c;
    public final String d;

    public void VideoTemplateProject$o(VideoTemplateProject p0,boolean p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       ArrayList templateGrou;
       VideoTemplateProject$o obj;
       VideoTemplate videoTemplat = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$o.class, "1");
       if (videoTemplat != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          int i = 0;
          if (this.c != null) {
             templateGrou = p0.a().getTemplateGroups();
             if (templateGrou != null && ((templateGrou.isEmpty() ^ 1) == 1 && a.g(templateGrou.get(i).getGroupName(), "ÍÆ¼ö"))) {
                VideoTemplateResponse videoTemplat1 = this.b.M0();
                if (videoTemplat1 != null) {
                   obj = templateGrou.get(i);
                   a.o(obj, "groups[0]");
                   videoTemplat1.appendStandaloneRecoGroup(obj);
                }
             }
          }else {
             this.b.S0(p0.a());
          }
          Object[] objArray = new Object[i];
          g.D().w("VideoTemplateProject", "mPreSelectThemeId="+this.b.S(), objArray);
          ArrayList uArrayList = null;
          if (!TextUtils.x(this.b.S())) {
             obj = this.b;
             videoTemplat = obj.L0(obj.S());
          }else {
             templateGrou = uArrayList;
          }
          if (videoTemplat == null) {
             ArrayList templateGrou1 = p0.a().getTemplateGroups();
             if (templateGrou1 != null && (templateGrou1.isEmpty() ^ 1) == 1) {
                objArray = new Object[i];
                g.D().w("VideoTemplateProject", "selectedTemplate is null but template response is not empty", objArray);
                p0 = p0.a().getTemplateGroups();
                if (p0 != null) {
                   p0 = CollectionsKt___CollectionsKt.p2(p0);
                   if (p0 != null) {
                      uArrayList = p0.getTemplates();
                   }
                }
                Objects.requireNonNull(t.a);
                if (uArrayList != null) {
                   p0 = CollectionsKt___CollectionsKt.p2(uArrayList);
                   if (p0 != null) {
                   label_00ed :
                      if (this.c != null && ((a.g(p0.getId(), "-1") ^ 1) && a.g(p0.getId(), this.d))) {
                         if (uArrayList != null) {
                            i = uArrayList.size();
                         }
                         if (i > 1) {
                            a.m(uArrayList);
                            p0 = uArrayList.get(1);
                            a.o(p0, "templates!![1]");
                         }
                      }
                   label_0120 :
                      videoTemplat = p0;
                   }
                }
                p0 = this.b.H0();
                goto label_00ed ;
             }
          }
          p0 = this.b;
          if (videoTemplat == null) {
             videoTemplat = p0.H0();
          }
          p0.R0(videoTemplat);
          videoTemplat = this.b.J0();
       }
       return videoTemplat;
    }
}
