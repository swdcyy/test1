package a4c.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import java.lang.CharSequence;
import rnc.i;
import android.widget.TextView;
import java.lang.Long;
import java.text.DecimalFormat;
import java.lang.StringBuilder;
import android.content.Context;
import android.text.TextPaint;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import im8.f;
import java.lang.Integer;
import wm6.a;
import java.util.Objects;
import com.yxcorp.gifshow.music.MusicRankLabelViewGroup;
import com.yxcorp.gifshow.music.MusicRankLabelView;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import com.kuaishou.android.model.music.MusicRankModelV2;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.widget.LinearLayout;
import a4c.i;
import android.view.View$OnClickListener;
import y3c.y;
import s1c.r0;
import y3c.y$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MusicBillboardPackage;
import k2b.u1;
import ekd.m1;
import com.kwai.library.widget.specific.misc.SpectrumView;

public class j extends PresenterV2	// class@000074
{
    public Music p;
    public r0 q;
    public f r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public SpectrumView w;
    public MusicRankLabelViewGroup x;

    public void j(){
       super();
    }
    public void E8(){
       int i;
       String str1;
       y$a a;
       String str = "3";
       if (PatchProxy.applyVoid(null, this, j.class, str)) {
          return;
       }
       this.s.setText(i.j(this.p.mName));
       i = 8;
       this.v.setVisibility(i);
       int i1 = 0;
       this.u.setVisibility(i1);
       Music mPhotoCount = this.p.mPhotoCount;
       if (mPhotoCount != null && mPhotoCount.longValue() > 0) {
          str1 = (this.p.mPhotoCount.longValue() - 0x2710 > 0)? new DecimalFormat("#.0").format(((double)this.p.mPhotoCount.longValue() / 10000.00f))+"w ": this.p.mPhotoCount.toString();
       }else {
          str1 = "0";
       }
       int i2 = 1;
       Object[] objArray = new Object[i2];
       objArray[i1] = str1;
       this.u.setText(this.getContext().getString(R.string.arg_RES_7f103f5f, objArray));
       if (this.p.isOriginal != null) {
          this.t.setText(R.string.arg_RES_7f103b3b);
          this.t.setBackgroundResource(R.drawable.arg_RES_7f0818d8);
          this.t.getPaint().setFakeBoldText(i2);
          this.t.setVisibility(i1);
       }else {
          this.t.setVisibility(i);
          if (TextUtils.x(this.p.mArtist)) {
             this.u.setVisibility(i);
             ViewGroup$MarginLayoutParams layoutParams = this.w.getLayoutParams();
             layoutParams.setMargins(i1, i1, i1, i1);
             this.w.setLayoutParams(layoutParams);
          }
       }
       Integer integer = this.r.get();
       if (integer == null) {
          integer = Integer.valueOf(-1);
       }
       int i3 = integer.intValue();
       if (a.b(this.p)) {
          j tx = this.x;
          j tp = this.p;
          Objects.requireNonNull(tx);
          if (PatchProxy.applyVoidOneRefs(tp, tx, MusicRankLabelViewGroup.class, "2") || (tp != null && tp.mMusicRankModelV2 != null)) {
             MusicRankLabelViewGroup b1 = tx.b;
             Objects.requireNonNull(b1);
             if (!PatchProxy.applyVoidOneRefs(tp, b1, MusicRankLabelView.class, str) && tp.mMusicRankModelV2 != null) {
                b1.f.clear();
                SpannableStringBuilder spannableStr = new SpannableStringBuilder("NO.");
                spannableStr.setSpan(new AbsoluteSizeSpan(12, i2), i1, spannableStr.length(), 17);
                SpannableStringBuilder spannableStr1 = new SpannableStringBuilder(String.valueOf(tp.mMusicRankModelV2.mRankNum));
                spannableStr1.setSpan(new AbsoluteSizeSpan(12, i2), i1, spannableStr1.length(), 17);
                MusicRankLabelView f = b1.f;
                f.append(spannableStr);
                f.append(spannableStr1);
                b1.setText(b1.f);
                StaticLayout staticLayout1 = new StaticLayout(b1.f, b1.getPaint(), 0x2710, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
                b1.g = spannableStr;
             }
             MusicRankLabelViewGroup c = tx.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoidOneRefs(tp, c, MusicRankLabelView.class, "4") && tp.mMusicRankModelV2 != null) {
                c.f.clear();
                c.f.append(tp.mMusicRankModelV2.mRankName);
                c.setText(c.f);
                StaticLayout staticLayout = new StaticLayout(c.f, c.getPaint(), 0x2710, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
                c.g = str;
             }
          }
       label_01b9 :
          this.x.setVisibility(i1);
          this.x.setOnClickListener(new i(this, i3));
          a = y.a;
          j tp1 = this.p;
          r0 b = this.q.b;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(y$a.class) || !PatchProxy.applyVoidFourRefs(tp1, null, b, Integer.valueOf(i3), a, y$a.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 0x7930;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (b != null) {
                uContentPack.profilePackage = a.c(b);
             }
             ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
             if (tp1 != null) {
                uContentPack.musicDetailPackage = a.b(tp1, i3);
                uContentWrap.musicBillboardPackage = a.a(tp1);
             }
             u1.v0(6, uElementPack, uContentPack, uContentWrap);
          }
       }else {
          this.x.setVisibility(i);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a3aab);
       this.x = m1.f(p0, 0x7f0a2cc6);
       this.t = m1.f(p0, 0x7f0a3cc3);
       this.v = m1.f(p0, 0x7f0a3b3f);
       this.s = m1.f(p0, 0x7f0a2d10);
       this.u = m1.f(p0, 0x7f0a0a95);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.q8(Music.class);
       this.q = this.q8(r0.class);
       this.r = this.x8("ADAPTER_POSITION");
       return;
    }
}
