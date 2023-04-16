package com.kwai.video.westeros.models.Bitmap$Builder;
import com.kwai.video.westeros.models.BitmapOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.Bitmap;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.Bitmap$1;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.Bitmap$Format;

public final class Bitmap$Builder extends GeneratedMessageLite$Builder implements BitmapOrBuilder	// class@000eb8
{

    public void Bitmap$Builder(){
       super(Bitmap.DEFAULT_INSTANCE);
    }
    public void Bitmap$Builder(Bitmap$1 p0){
       super();
    }
    public Bitmap$Builder clearData(){
       this.copyOnWrite();
       this.instance.clearData();
       return this;
    }
    public Bitmap$Builder clearFormat(){
       this.copyOnWrite();
       this.instance.clearFormat();
       return this;
    }
    public Bitmap$Builder clearHeight(){
       this.copyOnWrite();
       this.instance.clearHeight();
       return this;
    }
    public Bitmap$Builder clearWidth(){
       this.copyOnWrite();
       this.instance.clearWidth();
       return this;
    }
    public ByteString getData(){
       return this.instance.getData();
    }
    public Bitmap$Format getFormat(){
       return this.instance.getFormat();
    }
    public int getFormatValue(){
       return this.instance.getFormatValue();
    }
    public int getHeight(){
       return this.instance.getHeight();
    }
    public int getWidth(){
       return this.instance.getWidth();
    }
    public Bitmap$Builder setData(ByteString p0){
       this.copyOnWrite();
       this.instance.setData(p0);
       return this;
    }
    public Bitmap$Builder setFormat(Bitmap$Format p0){
       this.copyOnWrite();
       this.instance.setFormat(p0);
       return this;
    }
    public Bitmap$Builder setFormatValue(int p0){
       this.copyOnWrite();
       this.instance.setFormatValue(p0);
       return this;
    }
    public Bitmap$Builder setHeight(int p0){
       this.copyOnWrite();
       this.instance.setHeight(p0);
       return this;
    }
    public Bitmap$Builder setWidth(int p0){
       this.copyOnWrite();
       this.instance.setWidth(p0);
       return this;
    }
}
