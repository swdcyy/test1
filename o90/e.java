package o90.e;
import androidx.lifecycle.Observer;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i1;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.StringBuilder;
import o90.c;
import o90.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Runnable;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;

public final class e implements Observer	// class@00276f
{
    public final KuaiShanEditActivityV2 b;
    public final KSTemplateDetailInfo c;

    public void e(KuaiShanEditActivityV2 p0,KSTemplateDetailInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          e tb = this.b;
          if (tb.O == null) {
             i1.c(p0);
             tb.G3();
          }else if(!e.s(p0)){
             e.p(p0);
             tb.G3();
          }else {
             m1 om1 = m1.w0();
             a.o(om1, "KuaiShanManager.getInstance\(\)");
             o1 oo1 = om1.v0();
             if (oo1 != null) {
                a.o(oo1, "KuaiShanManager.getInsta\x20\x02rentProject ?: return@run\x00");
                e.v(p0, "Downloading works for template:"+oo1.k0().mTemplateId+" failed, 模板资源下载失败，磁盘空间不够，已有处理逻辑");
                c uoc = new c(tb, this, p0);
                if (tb.P == null && tb.S != null) {
                   e.D(tb, uoc, new d(tb));
                }else {
                   PostWorkErrorTips.b(R.string.arg_RES_7f1043cd);
                   tb.G3();
                }
             }
          }
       }
       return;
    }
}
