package com.kwai.live.gzone.promotion.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t67.a;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionSoGame;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import y8c.d;
import android.view.View;
import com.kwai.live.gzone.promotion.LiveGzonePromotionGameRecyclerFragment$a;
import qvb.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextPaint;
import s67.n1;
import android.view.View$OnClickListener;
import s67.e;

public class t extends PresenterV2	// class@000dd9
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public View s;
    public View t;
    public e u;
    public a v;
    public d w;
    public LiveGzonePromotionGameRecyclerFragment$a x;

    public void t(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       this.p.U(this.v.d.mGameIcons);
       this.q.setText(this.v.d.mGameName);
       this.r.setText(this.v.d.mGameDescription);
       if (!this.w.get()) {
          this.s.setVisibility(8);
       }else {
          this.s.setVisibility(0);
       }
       if (this.w.get() == this.x.V1() && this.w.get() < (this.x.getCount() - 1)) {
          this.t.setVisibility(0);
       }else {
          this.t.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a1f11);
       this.q = p0.findViewById(0x7f0a1f17);
       this.r = p0.findViewById(0x7f0a1f08);
       this.s = p0.findViewById(0x7f0a1f13);
       this.t = p0.findViewById(0x7f0a1f15);
       TextView textView = p0.findViewById(R.id.live_gzone_game_promotion_start_view);
       textView.getPaint().setFakeBoldText(true);
       textView.setOnClickListener(new n1(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "2")) {
          return;
       }
       this.v = this.q8(a.class);
       this.u = this.q8(e.class);
       this.w = this.r8("ADAPTER_POSITION_GETTER");
       this.x = this.r8("DETAIL_PAGE_LIST");
       return;
    }
}
