package com.kuaishou.edit.draft.Beauty$Item$a;
import com.kuaishou.edit.draft.Beauty$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Beauty$Item;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Beauty$a;
import com.kuaishou.edit.draft.Beauty$Item$ID;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class Beauty$Item$a extends GeneratedMessageLite$Builder implements Beauty$c	// class@001733
{

    public void Beauty$Item$a(){
       super(Beauty$Item.DEFAULT_INSTANCE);
    }
    public void Beauty$Item$a(Beauty$a p0){
       super(Beauty$Item.DEFAULT_INSTANCE);
    }
    public Beauty$Item$a a(Beauty$Item$ID p0){
       this.copyOnWrite();
       this.instance.setId(p0);
       return this;
    }
    public Beauty$Item$a b(float p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
    public Beauty$Item$ID getId(){
       return this.instance.getId();
    }
    public int getIdValue(){
       return this.instance.getIdValue();
    }
    public boolean getIsAdjusted(){
       return this.instance.getIsAdjusted();
    }
    public String getLogName(){
       return this.instance.getLogName();
    }
    public ByteString getLogNameBytes(){
       return this.instance.getLogNameBytes();
    }
    public float getValue(){
       return this.instance.getValue();
    }
}
