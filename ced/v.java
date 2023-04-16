package ced.v;
import android.view.View$OnLongClickListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.m;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import e17.i;
import com.google.gson.JsonObject;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import zdd.a;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.utils.k;
import k2b.u1;
import java.util.concurrent.atomic.AtomicReference;
import com.kuaishou.android.model.mix.LipsSyncModel;
import com.yxcorp.gifshow.entity.QPhoto;

public final class v implements View$OnLongClickListener	// class@000589
{
    public final m b;

    public void v(m p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       v tb = this.b;
       m p = tb.p;
       TagInfo mTagType = p.mTagType;
       int i = 1;
       if (mTagType == 3 && p.mMusicHasCopyright == null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f103d7a);
          i = false;
       }else if(mTagType == 10){
          t.l(i, tb.r, a.f(p, "CLICK_I_WANT_TO_CAPTURE_TOO_BUTTON", tb.R8()), null);
          k.c(tb.getActivity(), tb.s.mStickerLinkInfo);
          tb.A.set(u1.f());
       }else {
          p = tb.B;
          if (p != null && (p.getLipsSyncModel() != null && !tb.W8())) {
             tb.S8();
          }else {
             tb.V8();
          }
       }
       return i;
    }
}
