package com.kuaishou.edit.draft.DeletedRange$b;
import z30.v;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.DeletedRange;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.DeletedRange$a;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.TimeRange;

public final class DeletedRange$b extends GeneratedMessageLite$Builder implements v	// class@00176e
{

    public void DeletedRange$b(){
       super(DeletedRange.DEFAULT_INSTANCE);
    }
    public void DeletedRange$b(DeletedRange$a p0){
       super(DeletedRange.DEFAULT_INSTANCE);
    }
    public DeletedRange$b a(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public TimeRange getRange(){
       return this.instance.getRange();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasRange(){
       return this.instance.hasRange();
    }
}
