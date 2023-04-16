package com.yxcorp.gifshow.v3.previewer.d0;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import mq.d;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lwc.a1;
import java.lang.Runnable;
import ekd.k1;
import wwc.n0;
import lq.i;
import java.util.Objects;
import faa.a;
import q87.c;
import r1c.h;
import r1c.p$b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import lwc.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import r26.e;
import r26.a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.app.Activity;
import r1c.x$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lnc.pb;
import kotlin.jvm.internal.a;
import lnc.pb$a;
import org.json.JSONObject;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.s;
import r1c.q$b;
import y26.b$a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import yaa.c;
import prc.d;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y26.b;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import w26.a;
import java.lang.Integer;
import w26.c;
import o56.c;
import o56.a;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import f6c.a;
import bba.b;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import wba.f0;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kuaishou.edit.draft.Workspace$From;
import java.util.List;
import java.util.Collection;
import ekd.q;
import qvb.s;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.StringBuilder;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.previewer.d0$a;
import t36.f$a;

public class d0 implements GraphTaskExecuteManager$b	// class@001591
{
    public final boolean a;
    public final PhotosEditPreviewV3Fragment b;

    public void d0(PhotosEditPreviewV3Fragment p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       d.c(this);
    }
    public void b(){
       d.d(this);
    }
    public void c(GraphTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "3")) {
          return;
       }
       k1.r(new a1(this, this), 0);
       this.b.g1.a();
       this.b.Ah();
       return;
    }
    public void d(){
       boolean i4;
       PhotosEditPreviewV3Fragment y;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0.class, "2")) {
          return;
       }
       int i = -1;
       String str = "PhotosEditPreviewV3Fragment";
       int i1 = 0;
       if (i.m().M() && this.a == null) {
          d0 tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, PhotosEditPreviewV3Fragment.class, "45")) {
             Object[] objArray1 = new Object[i1];
             a.D().w(str, "finishForDataWhenTaskDone\(\) called", objArray1);
             p$b uob = tb.w1.b("PhotosEncodeRequestBuildMTNSTask");
             if (uob == null) {
                i1.c(new RuntimeException("nextOnTaskGraph error graph result is null"));
             }else {
                int i2 = uob.a();
                a uoa = d.a(-273232199).a20();
                uoa.V3(new c(tb.Y, i2));
                Intent intent = new Intent();
                intent.putExtra("activity_result_encode_id", uoa.L0(i2).getEncodeInfo().getId());
                BasePostActivity activity = tb.getActivity();
                tb.Ah();
                if (activity != null) {
                   i.m().d0(3);
                   activity.setResult(i, intent);
                   activity.finish();
                }
             }
          }
          return;
       }else {
          x$b uob1 = this.b.w1.b("StartGraphMTNSTask");
          if (uob1 != null) {
             int i3 = 7;
             i4 = 445;
             long l = k1.t(uob1.d());
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             y = this.b.Y;
             pb$a e = pb.e;
             Objects.requireNonNull(e);
             a.p(y, "workspaceDraft");
             if (!e.f(y)) {
                objArray2 = objArray;
             }else {
                JSONObject jSONObject = new JSONObject();
                VideoContext videoContext = y.d1();
                a.o(videoContext, "workspaceDraft.videoContext");
                jSONObject.put("extra_info", videoContext.T());
                jSONObject.put("app_name", "com.kwai.m2u");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.params = jSONObject.toString();
                objArray2 = uElementPack;
             }
             s.f(i3, i4, l, uContentPack, "success", "", objArray2);
          }
          this.b.w1.h(this);
          b$a uoa1 = this.b.w1.b("PhotosShareParamRequestBuildMTNSTask").a();
          if (this.b.getActivity() != null && d.a(this.b.Y.v(), this.b.Y.J0())) {
             uoa1.f(a1.p(R.string.arg_RES_7f100b17), i1);
          }
          if (this.a != null) {
             d0 tb1 = this.b;
             GifshowActivity activity1 = tb1.getActivity();
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoidTwoRefs(uoa1, activity1, tb1, PhotosEditPreviewV3Fragment.class, "44")) {
                uoa1.P(tb1.Y.d1());
                b uob2 = uoa1.g();
                uob2.setArgs(i.g());
                int i5 = d.a(0x27e26f6e).lS(activity1, uob2, false, tb1.Y, null);
                i.m().Q("POST_WORK_INFO_ID", Integer.valueOf(i5));
                if (a.a().c() && i5 == i) {
                   Toast.makeText(tb1.getContext(), "直接发布作品失败", i1).show();
                }
                tb1.Y.j1(Phase.POST);
                a.l();
                i4 = 1;
                if (i.h()) {
                   i.m().d0(i4);
                   i4 = i.m().B();
                }
                a.i(i5);
                if (i4) {
                   activity1.finishAffinity();
                   y = tb1.Y;
                   if (y != null) {
                      objArray = f0.a(y.Q0());
                   }
                   a.a.f(activity1, objArray);
                   activity1.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
                }else {
                   Intent intent1 = new Intent();
                   intent1.putExtra("video_file_upload_id", i5);
                   if (i.h()) {
                      intent1.putExtra("conversionTaskList", i.m().z("conversionTaskList"));
                   }
                   activity1.setResult(i, intent1);
                   activity1.finish();
                }
                tb1.g1.d();
             }
             return;
          }else if(this.b.Y.B0() == Workspace$From.NEW_USER_WIDGET && q.f(this.b.Y.Q0().o())){
             uoa1.f(a1.p(R.string.arg_RES_7f1037ec), i1);
          }
          s.b().c(1, uoa1.g(), this.b.getActivity(), 529, null);
          this.b.getActivity().overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
          this.b.g1.a();
          this.b.Ah();
          if (PostExperimentUtils.m()) {
             this.b.w1.c();
          }else {
             this.b.w1.e();
          }
          objArray = new Object[i1];
          a.D().w(str, "nextstep cost nextOnTaskGraph end", objArray);
          return;
       }
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PhotosEditPreviewV3Fragment", "nextOnTaskGraph onRunProcess isDirectlyPublish:"+this.a+",taskKey:"+p0, objArray);
       this.b.t1.o0().s0(new d0$a(this, p0));
       return;
    }
}
