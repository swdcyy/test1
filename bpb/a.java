package bpb.a;
import com.yxcorp.gifshow.music.cloudmusic.b;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import voc.a0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.cloudmusic.local.d;
import android.view.ViewGroup;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$ElementType;
import tob.d0;
import tob.b;
import tob.a;
import cpb.b;
import tob.o;
import tob.b0;
import i2b.a;
import ml8.c;

public class a extends b	// class@00041f
{
    public final a0 A;
    public final boolean B;
    public final LocalMusicFragment z;

    public void a(LocalMusicFragment p0,CloudMusicHelper p1,a0 p2,boolean p3){
       super(p1);
       this.z = p0;
       this.A = p2;
       this.B = p3;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Music music = this.N0(p0);
       if (music == d.s) {
          return 2;
       }else if(music != null && !this.A.b(music)){
          return 1;
       }else {
          return 0;
       }
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       View view = CloudMusicViewFactory.a(p0, p1);
       int i = 8;
       if (p1 == 1) {
          CloudMusicViewFactory.d(view.findViewById(R.id.stub_view_1), CloudMusicViewFactory$ElementType.SCISSORS);
          CloudMusicViewFactory.d(view.findViewById(R.id.stub_view_2), CloudMusicViewFactory$ElementType.DELETE);
          view.findViewById(R.id.stub_view_3).setVisibility(i);
          obj.U7(new d0());
          obj.U7(new b());
          obj.U7(new a());
          obj.V7(R.id.delete_btn, new b(this.z, this.A));
          obj.V7(R.id.scissor_btn, new o());
          obj.U7(new b0());
       }else if(!p1){
          CloudMusicViewFactory.d(view.findViewById(R.id.stub_view_2), CloudMusicViewFactory$ElementType.SCISSORS);
          view.findViewById(R.id.stub_view_3).setVisibility(i);
          obj.U7(new d0());
          obj.U7(new b());
          obj.U7(new a());
          obj.V7(R.id.scissor_btn, new o());
          obj.U7(new b0());
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d1011);
       }
       return new f(view, obj);
    }
}
