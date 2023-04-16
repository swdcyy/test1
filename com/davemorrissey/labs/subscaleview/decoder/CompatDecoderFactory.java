package com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import java.lang.Class;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import java.lang.reflect.Constructor;

public class CompatDecoderFactory implements DecoderFactory	// class@000fbc
{
    public Bitmap$Config bitmapConfig;
    public Class clazz;

    public void CompatDecoderFactory(Class p0){
       super(p0, null);
    }
    public void CompatDecoderFactory(Class p0,Bitmap$Config p1){
       super();
       this.clazz = p0;
       this.bitmapConfig = p1;
    }
    public Object make(){
       if (this.bitmapConfig == null) {
          return this.clazz.newInstance();
       }
       Class[] uClassArray = new Class[]{Bitmap$Config.class};
       Object[] objArray = new Object[]{this.bitmapConfig};
       return this.clazz.getConstructor(uClassArray).newInstance(objArray);
    }
}
