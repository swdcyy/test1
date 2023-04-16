package ui9.b;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;

public interface abstract b	// class@003d7f
{

    void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3);
    void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3);
    void h(EffectDescription p0,EffectSlot p1);
    void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2);
    void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2);
}
