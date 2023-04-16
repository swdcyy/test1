package cl9.f2;
import android.view.View$OnClickListener;
import cl9.i2;
import java.lang.Object;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import lnc.i3;
import k2b.u1;

public final class f2 implements View$OnClickListener	// class@00061e
{
    public final i2 b;

    public void f2(i2 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f2 tb = this.b;
       tb.w.scrollToPositionWithOffset(tb.t, tb.s);
       tb.P8();
       if (PatchProxy.applyVoid(null, tb, i2.class, "9")) {
       }else {
          ClickMetaData uClickMetaDa = new ClickMetaData();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uContentPack.photoPackage = w1.f(tb.y.mQPhoto.mEntity);
          uElementPack.action2 = "LAST_VIEWED_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("button_area", "COMMENT");
          oi3.d("button_type", "DOWN");
          uElementPack.params = oi3.e();
          uClickMetaDa.setType(6);
          uClickMetaDa.setContentPackage(uContentPack);
          uClickMetaDa.setElementPackage(uElementPack);
          u1.B(uClickMetaDa);
       }
       return;
    }
}
