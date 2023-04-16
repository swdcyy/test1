package com.yxcorp.gifshow.model.MultiplePhotosProject$PreviewMusicTypeEnumSerializer;
import zk.i;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MultiplePhotosProject$PreviewMusicType;
import zk.h;
import zk.g;
import java.lang.Integer;
import java.lang.Number;

public class MultiplePhotosProject$PreviewMusicTypeEnumSerializer implements i, b	// class@001e59
{

    public void MultiplePhotosProject$PreviewMusicTypeEnumSerializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       MultiplePhotosProject$PreviewMusicType previewMusic = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiplePhotosProject$PreviewMusicTypeEnumSerializer.class, "1");
       if (previewMusic != PatchProxyResult.class) {
       }else {
          previewMusic = MultiplePhotosProject$PreviewMusicType.valueOfInt(p0.p());
       }
       return previewMusic;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       g og = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiplePhotosProject$PreviewMusicTypeEnumSerializer.class, "2");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(Integer.valueOf(p0.getValue()));
       }
       return og;
    }
}
