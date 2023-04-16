package com.kwai.video.clipkit.mv.FaceSmoothV2;
import com.kwai.video.clipkit.mv.ClipAssetManager;
import java.util.Map;
import java.util.List;

public interface abstract FaceSmoothV2	// class@001ac8
{

    boolean init(ClipAssetManager p0);
    boolean init(ClipAssetManager p0,Map p1);
    void process(ClipAssetManager p0,List p1);
    void release();
}
