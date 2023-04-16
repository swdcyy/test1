package aw9.z;
import java.util.List;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;
import android.view.View;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.lang.String;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;

public interface abstract z	// class@0002de
{

    boolean b();
    boolean c();
    List d();
    void e();
    void f(EditorSdk2AnimatedRenderView p0);
    double g();
    View getPlayer();
    EditorSdk2V2$VideoEditorProject getProject();
    void h();
    EditorSdk2V2$AnimatedSubAsset[] i();
    boolean isPlaying();
    void j(EditorSdk2AnimatedRenderView p0);
    void k(EditorSdk2V2$AnimatedSubAsset[] p0);
    void l();
    void m(String p0,VideoSDKPlayerView$e p1);
    void n(boolean p0);
    void o(double p0);
    Size p(int p0);
    void pause();
    void play();
    double q();
}
