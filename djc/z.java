package djc.z;
import djc.w;
import djc.y;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;
import djc.b0;
import java.lang.Number;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import lnc.a1;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.share.widget.CardsAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.ArrayList;
import ekd.q;

public final class z implements w	// class@002230
{
    public KwaiImageView b;
    public final y c;

    public void z(y p0){
       a.p(p0, "forwardCards");
       super();
       this.c = p0;
    }
    public View da(){
       z obj = PatchProxy.apply(null, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("closeButton");
       }
       return obj;
    }
    public void doBindView(View p0){
       Integer integer;
       z oz = z.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oz, "2")) {
          return;
       }
       a.p(p0, "rootView");
       TextView textView = p0.findViewById(R.id.desc);
       RecyclerView recyclerView = p0.findViewById(R.id.recyclerViewFirst);
       RecyclerView recyclerView1 = p0.findViewById(R.id.recyclerViewSecond);
       View view = p0.findViewById(R.id.cancelButton);
       a.o(view, "rootView.findViewById\(R.id.cancelButton\)");
       this.b = view;
       p0.findViewById(R.id.titleIcon).L(this.c.e());
       z tb = this.b;
       if (tb == null) {
          a.S("closeButton");
       }
       tb.L(this.c.a());
       String str = "desc";
       if (!TextUtils.x(this.c.c())) {
          a.o(textView, str);
          textView.setVisibility(0);
          textView.setText(this.c.c());
          if (!PatchProxy.applyVoidOneRefs(textView, this, oz, "3")) {
             float f = (float)n.z(a.b()) / n.i(a.b());
             if (f - 0x43aa0000 < 0) {
                f = 11.50f;
             }else if(f - 0x43b40000 < 0){
                f = 12.00f;
             }else {
                y descFontSize = this.c.descFontSize;
             }
             textView.setTextSize(1, f);
          }
          integer = b0.a(this.c.descFontColor);
          if (integer != null) {
             textView.setTextColor(integer.intValue());
          }
       }else {
          a.o(textView, str);
          textView.setVisibility(8);
       }
       integer = b0.a(this.c.startColor);
       Integer integer1 = b0.a(this.c.endColor);
       if (integer != null && integer1 != null) {
          if (a.g(integer, integer1) ^ 1) {
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setOrientation(GradientDrawable$Orientation.TOP_BOTTOM);
             int[] ointArray = new int[]{integer.intValue(),integer1.intValue()};
             gradientDraw.setColors(ointArray);
             p0.setBackground(gradientDraw);
          }else {
             p0.setBackgroundColor(integer.intValue());
          }
       }
       int i = a1.e(2.50f);
       recyclerView.setHasFixedSize(1);
       recyclerView1.setHasFixedSize(1);
       List list = this.c.b();
       List list1 = this.c.d();
       String str1 = "rvFirst";
       if (list != null && (list.isEmpty() ^ 1) == 1) {
          a.o(recyclerView, str1);
          recyclerView.setAdapter(new CardsAdapter(list.get(0), 0));
          recyclerView.setLayoutManager(new LinearLayoutManager(p0.getContext(), 0, 0));
          recyclerView.addItemDecoration(new e(0, i, 0));
          if (list.size() > 1) {
             a.o(recyclerView1, "rvSecond");
             recyclerView1.setAdapter(new CardsAdapter(list.get(1), 0));
             recyclerView1.setLayoutManager(new LinearLayoutManager(p0.getContext(), 0, 0));
             recyclerView1.addItemDecoration(new e(0, i, 0));
          }
       }else if(list1 != null){
          Collection uCollection = null;
          if (list1.size() > 5) {
             list1 = new ArrayList(list1.subList(0, 4));
             uCollection = new ArrayList(list1.subList(4, list1.size()));
          }
          a.o(recyclerView, str1);
          recyclerView.setAdapter(new CardsAdapter(list1, 1));
          recyclerView.setLayoutManager(new LinearLayoutManager(p0.getContext(), 0, 0));
          recyclerView.addItemDecoration(new e(0, i, 0));
          if (!q.f(uCollection)) {
             a.o(recyclerView1, "rvSecond");
             a.m(uCollection);
             recyclerView1.setAdapter(new CardsAdapter(uCollection, 1));
             recyclerView1.setLayoutManager(new LinearLayoutManager(p0.getContext(), 0, 0));
             recyclerView1.addItemDecoration(new e(0, i, 0));
          }
       }
       return;
    }
    public boolean p9(){
       return true;
    }
    public int y0(){
       return 0x7f0d0482;
    }
}
