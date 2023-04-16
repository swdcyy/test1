package era.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import era.a$a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcTicketModel;
import java.util.Objects;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.CharSequence;
import android.text.SpannableString;
import java.lang.StringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.graphics.Typeface;
import ekd.d0;
import android.text.TextUtils;
import android.view.ViewGroup;
import i2b.a;

public final class a extends RecyclerView$Adapter	// class@0027b4
{
    public final int e;
    public final int f;
    public final List g;
    public final Context h;
    public final boolean i;

    public void a(List p0,Context p1,boolean p2){
       a.p(p0, "list");
       a.p(p1, "context");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.e = 1;
    }
    public void a(List p0,Context p1,boolean p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = true;
       }
       super(p0, p1, p2);
       return;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a tf = (this.g.size() == 2 && (this.i != null && p0 == 2))? this.f: this.e;
       return tf;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.g.size() == 2 && this.i != null)? 3: this.g.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          a.p(p0, "holder");
          GrowthVfcTicketModel growthVfcTic = CollectionsKt___CollectionsKt.F2(this.g, p1);
          if (growthVfcTic != null) {
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(growthVfcTic, p0, a$a.class, "1")) {
                a.p(growthVfcTic, "data");
                TextView textView = p0.a.findViewById(R.id.ticket_amount);
                TextView textView1 = p0.a.findViewById(R.id.ticket_title);
                TextView textView2 = p0.a.findViewById(R.id.ticket_sub_title);
                TextView textView3 = p0.a.findViewById(R.id.ticket_desc);
                KwaiImageView kwaiImageVie = p0.a.findViewById(R.id.ticket_mask);
                KwaiImageView kwaiImageVie1 = p0.a.findViewById(R.id.ticket_corner_bg);
                p0.a.findViewById(R.id.ticket_background).setImageURI(growthVfcTic.bgImg);
                a.o(textView1, "title");
                textView1.setText(growthVfcTic.title);
                a.o(textView2, "subTitle");
                textView2.setText(growthVfcTic.subTitle);
                a.o(textView3, "validity");
                textView3.setText(growthVfcTic.tip);
                SpannableString spannableStr = new SpannableString("£¤"+growthVfcTic.amount);
                spannableStr.setSpan(new AbsoluteSizeSpan(16, true), 0, true, 33);
                textView.setText(spannableStr);
                textView.setTypeface(d0.a("alte-din.ttf", textView.getContext()));
                if (!TextUtils.isEmpty(growthVfcTic.maskImg)) {
                   kwaiImageVie.setImageURI(growthVfcTic.maskImg);
                }
                if (!TextUtils.isEmpty(growthVfcTic.cornerBg)) {
                   kwaiImageVie1.setImageURI(growthVfcTic.cornerBg);
                }
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$a uoa1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa1 != PatchProxyResult.class) {
          label_003c :
             return uoa1;
          }
       }
       a.p(p0, "parent");
       p1 = (p1 == this.e)? 0x7f0d0589: 0x7f0d058a;
       View view = a.d(p0.getContext(), p1, p0, false);
       a.o(view, "KwaiLayoutInflater.infla¡­ layoutId, parent, false\)");
       uoa1 = new a$a(this, view);
       goto label_003c ;
    }
}
