package class1.classQ;

import java.util.ArrayList;
import java.util.List;

public class MovieReviewMain2 {
    public static void main(String[] args) {
//        MovieReview[] reviews = new MovieReview[2];
        List<MovieReview> reviews = new ArrayList<>();

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
//        reviews[0] = inception;
        reviews.add(inception);

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
//        reviews[1] = aboutTime;
        reviews.add(aboutTime);

        for (MovieReview movieReview : reviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " +
                    movieReview.review);
        }
    }
}
