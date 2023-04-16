package com.kwai.video.player.IKwaiRepresentationListener;
import java.util.List;

public interface abstract IKwaiRepresentationListener	// class@000ab7
{

    void onRepresentationSelected(int p0,boolean p1);
    int onSelectRepresentation(List p0);
    void representationChangeEnd(int p0,boolean p1);
    void representationChangeStart(int p0,int p1);
}
