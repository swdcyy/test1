package l69.l;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import com.kwai.feature.post.api.aicut.AICutProjectOption;
import q79.d;
import android.app.Activity;
import android.widget.TextView;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e17.i;
import lnc.e7;
import tkd.b;
import tkd.d;
import ra0.d;
import l69.n;
import java.util.List;
import com.yxcorp.gifshow.models.QMedia;
import kotlin.jvm.internal.a;
import r79.c;
import java.lang.CharSequence;
import o79.q;
import java.util.Objects;
import java.lang.Boolean;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity;
import java.lang.Integer;
import com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity$a;
import l69.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import lnc.a1;
import android.text.TextUtils;

public final class l extends m	// class@002c9f
{
    public final int c;
    public final IAlbumMainFragment d;
    public final boolean e;
    public final AICutProjectOption f;
    public final d g;
    public final Activity h;
    public final TextView i;
    public final String j;

    public void l(int p0,IAlbumMainFragment p1,boolean p2,AICutProjectOption p3,d p4,Activity p5,TextView p6,String p7){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       super();
    }
    public void a(View p0){
       l g;
       String str1;
       AICutProjectOption mMedias;
       l ol;
       l ol1;
       String str2;
       JsonObject jsonObject;
       g a;
       String str3;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, l.class, "1")) {
          return;
       }
       int i = 0x7f110668;
       if (obj.c <= null) {
          i.a(i, R.string.arg_RES_7f10018a);
          return;
       }else {
          e7.c("ai_cut_entrance");
          d.a(0x1bf6ff1d).P2();
          n f = n.f;
          List list = f.e(obj.d);
          if (obj.e == null) {
             obj.f.mMedias = list;
          }
          int i1 = 0x7f11066a;
          String str = "option.mMedias";
          int i2 = 0;
          if (list.isEmpty()) {
             QMedia qMedia = obj.f.mMedias.get(i2);
             g = obj.g;
             if (g != null) {
                a.o(qMedia, "defaultMedia");
                str1 = g.o0(qMedia);
             }else {
                str1 = null;
             }
             if (str1 != null) {
                i.d(i, str1);
                return;
             }else {
                mMedias = obj.f.mMedias;
                a.o(mMedias, str);
                if (!q.d(mMedias)) {
                   i.a(i1, R.string.arg_RES_7f1018bb);
                   return;
                }
             }
          }
          l h = obj.h;
          l i3 = obj.i;
          l f1 = obj.f;
          String taskId = obj.d.getTaskId();
          l e = obj.e;
          l j = obj.j;
          Objects.requireNonNull(f);
          n on = n.class;
          int i4 = 1;
          if (PatchProxy.isSupport(on)) {
             Object[] objArray = new Object[]{h,i3,f1,taskId,Boolean.valueOf(e),j};
             if (!PatchProxy.applyVoid(objArray, f, on, "14")) {
             label_00ba :
                Object[] objArray1 = new Object[i2];
                g.D().w("KwaiAICutModule", "showAiCutLoading\(\) called with: option = ["+f1+']', objArray1);
                if (i3.isSelected()) {
                   if (PatchProxy.applyVoidTwoRefs(h, f1, f, on, "15")) {
                      ol = j;
                      ol1 = e;
                      str2 = taskId;
                      jsonObject = 1;
                   }else {
                      AICutProjectOption mMedias1 = f1.mMedias;
                      a.o(mMedias1, str);
                      AICutProjectOption mTaskId = f1.mTaskId;
                      a.o(mTaskId, "option.mTaskId");
                      jsonObject = 1;
                      ol = j;
                      ol1 = e;
                      str2 = taskId;
                      KSPOSTAICutLoadingActivity.V.b(h, mMedias1, mTaskId, f1.mThemeId, f1.mTemplateType, f1.mMusicId, Integer.valueOf(f1.mMusicType), null);
                   }
                   if (ol1 != null) {
                      a = g.a;
                      Objects.requireNonNull(a);
                      if (!PatchProxy.applyVoidTwoRefs(str2, ol, a, g.class, "3")) {
                         a.p(ol, "cleanMode");
                         ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "PRODUCE_NEXT_TOAICUT";
                         if (ol.length() > 0) {
                            i2 = 1;
                         }
                         if (i2) {
                            jsonObject = new JsonObject();
                            jsonObject.c0("is_full_screen", ol);
                            uElementPack.params = jsonObject.toString();
                         }
                         uClickEvent.elementPackage = uElementPack;
                         ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                         uClickEvent.urlPackage = urlPackage;
                         urlPackage.page2 = "PHOTO_PREVIEW";
                         urlPackage.params = "task_id="+str2;
                         b.a(0x4b316083).e(uClickEvent);
                      }
                   }else {
                      g.a.a(jsonObject);
                   }
                }else {
                   mMedias = f1.mMedias;
                   a.o(mMedias, str);
                   if (!PatchProxy.applyVoidOneRefs(mMedias, f, on, "16")) {
                      if (f.j(mMedias) != -1) {
                         str3 = "";
                      }else {
                         str3 = a1.p(R.string.arg_RES_7f100b11);
                         a.o(str3, "CommonUtil.string\(R.stri¡­should_contain_video_tip\)");
                      }
                      if (!TextUtils.isEmpty(str3)) {
                         i.d(i1, str3);
                      }
                   }
                   g.a.a(i2);
                }
             }
          }else {
             goto label_00ba ;
          }
          return;
       }
    }
}
