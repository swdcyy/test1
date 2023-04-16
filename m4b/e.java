package m4b.e;
import android.view.View;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import android.content.Intent;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectHint;

public interface abstract e	// class@00362d
{

    void G();
    void doBindView(View p0);
    void e1(int p0);
    void h(EffectDescription p0,EffectSlot p1);
    void onActivityCallback(int p0,int p1,Intent p2);
    void onDestroy();
    void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2);
    void onEffectHintUpdated(EffectHint p0);
    void onResume();
    void unbind();
    void w();
    void w1(Intent p0);
    void x1();
    void y1();
}
