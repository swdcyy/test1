package ex8.b;
import ex8.b$a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.activity.share.model.PublishPageShareOption;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import ex8.c;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import android.content.Context;
import lnc.a1;
import ow8.c;
import java.util.Iterator;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Iterable;
import bba.b;
import qw8.o;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import qw8.o$a;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.Publish$ShareType;
import java.lang.Enum;

public final class b	// class@00224f
{
    public final List a;
    public PublishPageShareOption b;
    public final c c;
    public final VideoContext d;
    public final QPhoto e;
    public static final b$a f;

    static {
       b.f = new b$a(null);
    }
    public void b(c p0,VideoContext p1,QPhoto p2){
       Object[] objArray2;
       boolean b;
       b uob = b.class;
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.a = new ArrayList();
       this.b = PublishPageShareOption.NONE;
       if (p2 == null) {
          Object[] objArray = null;
          String str = "2";
          if (!PatchProxy.applyVoid(objArray, this, uob, str)) {
             List value = a.t().getValue("PublishPageShareOptions", new c().getType(), objArray);
             if (!q.f(value)) {
                List list = c.k(a1.c());
                b = (list == null || list.isEmpty())? true: false;
                if (!b) {
                   Iterator iterator = value.iterator();
                   while (iterator.hasNext()) {
                      String str1 = iterator.next();
                      Object[] objArray3 = new Object[0];
                      a.b().w("ShareBarRepo", "initShareOptionsFromKSwitch type "+str1, objArray3);
                      PublishPageShareOption wECHAT_SESSI = PublishPageShareOption.WECHAT_SESSION;
                      if (a.g(str1, wECHAT_SESSI.getKSwitch())) {
                         if (list.contains(wECHAT_SESSI.getKwaiOp())) {
                            this.a.add(wECHAT_SESSI);
                         }
                      }else {
                         wECHAT_SESSI = PublishPageShareOption.WECHAT_TIMELINE;
                         if (a.g(str1, wECHAT_SESSI.getKSwitch())) {
                            if (list.contains(wECHAT_SESSI.getKwaiOp())) {
                               this.a.add(wECHAT_SESSI);
                            }
                         }else {
                            wECHAT_SESSI = PublishPageShareOption.QQ_FRIEND;
                            if (a.g(str1, wECHAT_SESSI.getKSwitch())) {
                               if (list.contains(wECHAT_SESSI.getKwaiOp())) {
                                  this.a.add(wECHAT_SESSI);
                               }
                            }else {
                               wECHAT_SESSI = PublishPageShareOption.QQ_ZONE;
                               if (a.g(str1, wECHAT_SESSI.getKSwitch())) {
                                  if (list.contains(wECHAT_SESSI.getKwaiOp())) {
                                     this.a.add(wECHAT_SESSI);
                                  }
                               }else {
                                  wECHAT_SESSI = PublishPageShareOption.WEIBO;
                                  if (a.g(str1, wECHAT_SESSI.getKSwitch()) && list.contains(wECHAT_SESSI.getKwaiOp())) {
                                     this.a.add(wECHAT_SESSI);
                                  }
                               }
                            }
                         }
                      }
                   }
                   iterator = this.a.iterator();
                   while (iterator.hasNext()) {
                      Object[] objArray4 = new Object[0];
                      a.b().w("ShareBarRepo", "can show "+iterator.next().getKwaiOp(), objArray4);
                   }
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
             b tc = this.c;
             tc = (tc != null)? tc.Q0(): objArray;
             PublishPageShareOption publishPageS = PatchProxy.applyOneRefs(tc, objArray, o.class, str);
             if (publishPageS != PatchProxyResult.class) {
             }else if(tc == null || tc.v() == null){
                publishPageS = PublishPageShareOption.NONE;
             }else {
                switch (o$a.a[tc.v().getShareType().ordinal()]){
                    case 1:
                      publishPageS = PublishPageShareOption.WECHAT_SESSION;
                      break;
                    case 2:
                      publishPageS = PublishPageShareOption.WECHAT_TIMELINE;
                      break;
                    case 3:
                      publishPageS = PublishPageShareOption.QQ_FRIEND;
                      break;
                    case 4:
                      publishPageS = PublishPageShareOption.QQ_ZONE;
                      break;
                    case 5:
                      publishPageS = PublishPageShareOption.WEIBO;
                      break;
                    case 6:
                      publishPageS = PublishPageShareOption.MOMENT;
                      break;
                    default:
                      publishPageS = PublishPageShareOption.NONE;
                }
             }
             a.o(publishPageS, "ShareDraftUtil.getShareO\x20\x02ion\(mDraft?.publishDraft\)\x00");
             Object[] objArray1 = new Object[0];
             a.b().w("ShareBarRepo", "recoverFromDraft option: "+publishPageS, objArray1);
             if (c.k(a1.c()).contains(publishPageS.getKwaiOp()) && this.a.contains(publishPageS)) {
                this.b = publishPageS;
             }
          }
       }
    label_01d5 :
       return;
    }
    public final PublishPageShareOption a(){
       return this.b;
    }
    public final List b(){
       return this.a;
    }
}
