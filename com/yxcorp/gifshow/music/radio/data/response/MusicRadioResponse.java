package com.yxcorp.gifshow.music.radio.data.response.MusicRadioResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class MusicRadioResponse implements CursorResponse, Serializable	// class@002070
{
    public String mCursor;
    public String mLlsid;
    public List mPhotos;
    public static final long serialVersionUID = 0xa7abd69c332741c8;

    public void MusicRadioResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, MusicRadioResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
