package com.kuaishou.edit.draft.FaceMagicEffect$Extra$a;
import com.kuaishou.edit.draft.FaceMagicEffect$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FaceMagicEffect$a;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Url;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams;

public final class FaceMagicEffect$Extra$a extends GeneratedMessageLite$Builder implements FaceMagicEffect$c	// class@001795
{

    public void FaceMagicEffect$Extra$a(){
       super(FaceMagicEffect$Extra.DEFAULT_INSTANCE);
    }
    public void FaceMagicEffect$Extra$a(FaceMagicEffect$a p0){
       super(FaceMagicEffect$Extra.DEFAULT_INSTANCE);
    }
    public FaceMagicEffect$Extra$CheckMd5 getCheckMd5(int p0){
       return this.instance.getCheckMd5(p0);
    }
    public int getCheckMd5Count(){
       return this.instance.getCheckMd5Count();
    }
    public List getCheckMd5List(){
       return Collections.unmodifiableList(this.instance.getCheckMd5List());
    }
    public long getCheckSum(){
       return this.instance.getCheckSum();
    }
    public String getId(){
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       return this.instance.getIdBytes();
    }
    public Url getImage(int p0){
       return this.instance.getImage(p0);
    }
    public int getImageCount(){
       return this.instance.getImageCount();
    }
    public List getImageList(){
       return Collections.unmodifiableList(this.instance.getImageList());
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public FaceMagicEffect$Extra$PassThroughParams getPassThroughParams(){
       return this.instance.getPassThroughParams();
    }
    public Url getResource(int p0){
       return this.instance.getResource(p0);
    }
    public int getResourceCount(){
       return this.instance.getResourceCount();
    }
    public List getResourceList(){
       return Collections.unmodifiableList(this.instance.getResourceList());
    }
    public int getResourceType(){
       return this.instance.getResourceType();
    }
    public String getTag(){
       return this.instance.getTag();
    }
    public ByteString getTagBytes(){
       return this.instance.getTagBytes();
    }
    public String getTopic(){
       return this.instance.getTopic();
    }
    public ByteString getTopicBytes(){
       return this.instance.getTopicBytes();
    }
    public int getVersion(){
       return this.instance.getVersion();
    }
    public boolean hasPassThroughParams(){
       return this.instance.hasPassThroughParams();
    }
}
