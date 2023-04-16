package com.yxcorp.gifshow.edit.previewer.loaderv2.VideoAssetLoaderException;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import haa.f;
import java.lang.Object;
import q87.c;
import java.util.Iterator;
import pba.h;
import java.lang.StringBuilder;

public class VideoAssetLoaderException extends Exception	// class@001b2a
{

    public void VideoAssetLoaderException(String p0,List p1){
       super(p0);
       Object[] objArray = new Object[0];
       f.D().A("VideoAssetLoaderException", p0, objArray);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          objArray = new Object[0];
          f.D().A("VideoAssetLoaderException", "exceptional data "+iterator.next(), objArray);
       }
       return;
    }
}
