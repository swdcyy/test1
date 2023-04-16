package com.yxcorp.gifshow.v3.editor.cover.recommend.text.RecommendCoverTextViewHolder$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.cover.recommend.text.RecommendCoverTextViewHolder;
import kotlin.Pair;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import upc.a;
import upc.c;
import java.util.Objects;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.util.Pair;
import lnc.v6;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class RecommendCoverTextViewHolder$a implements View$OnClickListener	// class@000ecc
{
    public final RecommendCoverTextViewHolder b;
    public final Pair c;

    public void RecommendCoverTextViewHolder$a(RecommendCoverTextViewHolder p0,Pair p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecommendCoverTextViewHolder$a.class, "1")) {
          return;
       }
       RecommendCoverTextViewHolder$a tb = this.b;
       tb.b.a(tb.getAdapterPosition());
       c a = c.a;
       String second = this.c.getSecond();
       int i = this.b.getAdapterPosition() + 1;
       Object obj = this.c.getFirst();
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(second, Integer.valueOf(i), obj, a, c.class, "1")) {
          a.p(second, "type");
          a.p(obj, "text");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GUESS_PHOTO_TITLE";
          Pair[] pairArray = new Pair[]{new Pair("reco_result", obj),new Pair("result_type", second),new Pair("result_index", Integer.valueOf(i))};
          uElementPack.params = "1".a(pairArray);
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
