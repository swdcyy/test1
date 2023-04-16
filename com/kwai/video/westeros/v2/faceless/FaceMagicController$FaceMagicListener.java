package com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicListener;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectHint;
import java.lang.String;
import com.kwai.video.westeros.models.EffectError;

public interface abstract FaceMagicController$FaceMagicListener	// class@0010d2
{

    void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1);
    void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2);
    void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2);
    void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2);
    void onEffectHintUpdated(EffectHint p0);
    void onEffectPlayCompleted(EffectSlot p0,int p1);
    void onLoadGroupEffect(EffectDescription p0,EffectSlot p1,String p2);
    void onSetEffectFailed(EffectResource p0,EffectSlot p1,EffectError p2);
}
