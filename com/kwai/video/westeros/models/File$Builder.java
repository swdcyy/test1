package com.kwai.video.westeros.models.File$Builder;
import com.kwai.video.westeros.models.FileOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.File;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.File$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class File$Builder extends GeneratedMessageLite$Builder implements FileOrBuilder	// class@000f74
{

    public void File$Builder(){
       super(File.DEFAULT_INSTANCE);
    }
    public void File$Builder(File$1 p0){
       super();
    }
    public File$Builder clearIsBuiltin(){
       this.copyOnWrite();
       this.instance.clearIsBuiltin();
       return this;
    }
    public File$Builder clearPath(){
       this.copyOnWrite();
       this.instance.clearPath();
       return this;
    }
    public boolean getIsBuiltin(){
       return this.instance.getIsBuiltin();
    }
    public String getPath(){
       return this.instance.getPath();
    }
    public ByteString getPathBytes(){
       return this.instance.getPathBytes();
    }
    public File$Builder setIsBuiltin(boolean p0){
       this.copyOnWrite();
       this.instance.setIsBuiltin(p0);
       return this;
    }
    public File$Builder setPath(String p0){
       this.copyOnWrite();
       this.instance.setPath(p0);
       return this;
    }
    public File$Builder setPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPathBytes(p0);
       return this;
    }
}
