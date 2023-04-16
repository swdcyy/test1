package hnd.e;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import wmd.i;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import xvc.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hnd.f;
import java.lang.IllegalArgumentException;

public final class e implements ViewModelProvider$Factory	// class@000f9a
{
    public final TextTemplateRepo a;
    public final i b;
    public final TextFontRepoV3 c;
    public final TextTemplateRepoV3 d;
    public final boolean e;
    public final f f;
    public final VideoSDKPlayerView g;

    public void e(TextTemplateRepo p0,i p1,TextFontRepoV3 p2,TextTemplateRepoV3 p3,boolean p4,f p5,VideoSDKPlayerView p6){
       a.p(p0, "textTemplateRepo");
       a.p(p1, "subtitleRepo");
       a.p(p2, "fontRepo");
       a.p(p3, "designTemplateRepoV3");
       a.p(p5, "editRepo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public ViewModel create(Class p0){
       f obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (!a.g(p0, f.class)) {
          throw new IllegalArgumentException("Donot Use SubtitleViewModelFactory to create non-EffectViewModel");
       }
       obj = new f(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
       return a.g(p0, f.class);
    }
}
