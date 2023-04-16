package com.gifshow.tuna.player.component.IVideoModel;
import java.io.Serializable;
import java.lang.String;

public interface abstract IVideoModel implements Serializable	// class@0015e2
{

    String getCover();
    int getHeight();
    String getUri();
    int getWidth();
}
