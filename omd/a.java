package omd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.Friend;
import lu7.f;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import omd.a$a;
import android.view.View$OnClickListener;

public final class a extends PresenterV2	// class@002022
{
    public RelayDataItem p;
    public TextView q;
    public TextView r;
    public KwaiImageView s;
    public View t;
    public final a u;

    public void a(a p0){
       a.p(p0, "clickConsumer");
       super();
       this.u = p0;
    }
    public static final RelayDataItem P8(a p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mData");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tt = this.t;
       if (tt == null) {
          a.S("mSelectedIcon");
       }
       a tp = this.p;
       if (tp == null) {
          a.S("mData");
       }
       tt.setSelected(tp.isSelected());
       tt = this.r;
       String str = "mTvNickName";
       if (tt == null) {
          a.S(str);
       }
       tt.setVisibility(8);
       tt = this.p;
       if (tt == null) {
          a.S("mData");
       }
       Friend friend = tt.getFriend();
       if (friend != null) {
          a tq = this.q;
          if (tq == null) {
             a.S("mTvContent");
          }
          tq.setText(f.b(friend.getUserId(), friend.getUserName()));
          String nickName = friend.getNickName();
          tq = (nickName == null || !nickName.length())? 1: null;
          if (!tq) {
             tq = this.r;
             if (tq == null) {
                a.S(str);
             }
             tq.setText(friend.getNickName());
             tt = this.r;
             if (tt == null) {
                a.S(str);
             }
             tt.setVisibility(0);
          }
       }
       tt = this.s;
       if (tt == null) {
          a.S("mIcon");
       }
       tp = this.p;
       if (tp == null) {
          a.S("mData");
       }
       Friend friend1 = tp.getFriend();
       str = (friend1 != null)? friend1.getUserAvatar(): null;
       tt.M(str, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.text);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.text\)");
       this.q = view;
       view = m1.f(p0, R.id.nick_name);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.nick_name\)");
       this.r = view;
       view = m1.f(p0, R.id.icon);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.icon\)");
       this.s = view;
       view = m1.f(p0, R.id.selected_view);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.selected_view\)");
       this.t = view;
       p0.setOnClickListener(new a$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(RelayDataItem.class);
       a.o(obj, "inject\(RelayDataItem::class.java\)");
       this.p = obj;
       return;
    }
}
