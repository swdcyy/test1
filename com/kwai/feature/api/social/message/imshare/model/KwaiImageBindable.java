package com.kwai.feature.api.social.message.imshare.model.KwaiImageBindable;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;

public abstract class KwaiImageBindable implements Serializable	// class@00115d
{
    public final Serializable bindable;
    public static final long serialVersionUID = 0xf859441a26154b6d;

    public void KwaiImageBindable(Serializable p0){
       super();
       this.bindable = p0;
    }
    public abstract void bind(KwaiImageView p0);
}
