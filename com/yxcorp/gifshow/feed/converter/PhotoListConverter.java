package com.yxcorp.gifshow.feed.converter.PhotoListConverter;
import retrofit2.h;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import fg6.a;
import com.yxcorp.gifshow.feed.converter.PhotoListConverter$a;
import el.a;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import com.yxcorp.gifshow.feed.model.PhotoList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okio.b;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.Writer;
import com.google.gson.stream.b;

public final class PhotoListConverter implements h	// class@000ff2
{
    public final TypeAdapter mAdapter;
    public final Gson mGson;
    public static final Charset UTF_8;

    static {
       PhotoListConverter.UTF_8 = Charset.forName("UTF-8");
    }
    public void PhotoListConverter(){
       super();
       Gson a = a.a;
       this.mGson = a;
       this.mAdapter = a.j(new PhotoListConverter$a(this));
    }
    public Object convert(Object p0){
       return this.convert(p0);
    }
    public String convert(PhotoList p0){
       b obj = PatchProxy.applyOneRefs(p0, this, PhotoListConverter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       Charset uTF_8 = PhotoListConverter.UTF_8;
       b uob = this.mGson.o(new OutputStreamWriter(obj.outputStream(), uTF_8));
       this.mAdapter.write(uob, p0.mList);
       uob.close();
       return obj.readString(uTF_8);
    }
}
