package com.kuaishou.gifshow.kuaishan.ui.album.b;
import androidx.lifecycle.Observer;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import n90.e;
import com.kuaishou.gifshow.kuaishan.ui.album.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Runnable;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import lnc.g7;
import u80.e;
import q87.c;
import lnc.i1;

public final class b implements Observer	// class@001ab2
{
    public final KSPostAlbumProcessActivity b;

    public void b(KSPostAlbumProcessActivity p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       tb.z3();
       if (p0 == null) {
       }else if(tb.O != null){
          if (e.s(p0)) {
             if (tb.S != null) {
                e.v(p0, "Downloading works for template:"+tb.S.k0().mTemplateId+" failed, 模板资源下载失败，磁盘空间不够，已有处理逻辑");
                p0 = new e(tb);
                if (tb.P == null) {
                   e.D(tb, p0, e.b);
                }else {
                   PostWorkErrorTips.b(R.string.arg_RES_7f1043cd);
                }
             }
          }else if(g7.k(p0)){
             Object[] objArray = new Object[0];
             e.D().w("KSPostAlbumProcessActivity", "handleIllegalInfoDetectedException\(\) detect illegal info", objArray);
          }else {
             e.p(p0);
          }
       }else {
          i1.c(p0);
       }
       return;
    }
}
