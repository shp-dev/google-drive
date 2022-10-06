package googledrive.domain;

import googledrive.VideoProcessingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Video_table")
@Data

public class Video  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static VideoRepository repository(){
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(VideoRepository.class);
        return videoRepository;
    }




    public static void processVideo(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        VideoProcessing videoProcessing = new VideoProcessing(video);
        videoProcessing.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);

            VideoProcessing videoProcessing = new VideoProcessing(video);
            videoProcessing.publishAfterCommit();

         });
        */

        
    }


}
