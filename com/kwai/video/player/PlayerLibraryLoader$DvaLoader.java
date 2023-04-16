package com.kwai.video.player.PlayerLibraryLoader$DvaLoader;
import com.kwai.video.player.loader.PlayerLibrary;
import com.kwai.video.player.PlayerLibraryLoader$DvaListener;
import java.lang.String;

public interface abstract PlayerLibraryLoader$DvaLoader	// class@000b04
{

    void load(PlayerLibrary p0,PlayerLibraryLoader$DvaListener p1);
    void log(String p0);
    void setPriority(String p0,String p1);
    boolean shouldLoadSo();
}
