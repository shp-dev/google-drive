package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessing extends AbstractEvent {

    private Long id;

    public VideoProcessing(){
        super();
    }
}
