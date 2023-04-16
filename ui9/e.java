package ui9.e;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectDescription;
import java.lang.String;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectError;

public interface abstract e	// class@003d82
{

    void onEffectPlayCompleted(EffectSlot p0,int p1);
    void onLoadGroupEffect(EffectDescription p0,EffectSlot p1,String p2);
    void onSetEffectFailed(EffectResource p0,EffectSlot p1,EffectError p2);
}
