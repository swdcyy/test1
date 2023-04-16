package com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig;

public class PhotoMovieEncodeConfig extends EncodeConfig	// class@001d15
{

    public void PhotoMovieEncodeConfig(){
       super();
       this.mId = 5;
       this.mWidth = 720;
       this.mHeight = 1280;
       this.mX264Params = "ref=%d:cabac=1:mixed-refs=0:rc-lookahead=10:subme=5:trellis=0:weightp=1:crf=%d:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=0:ipratio=1.4:qcomp=0.6:keyint=1000:bframes=0:deblock=-3,-3:psy-rd=2.0,0.7:aq-strength=1.2:keyint-min=1000:open-gop=0";
    }
}
