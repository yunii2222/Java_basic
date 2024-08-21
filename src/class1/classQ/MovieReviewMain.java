package class1.classQ;

import java.util.ArrayList;
import java.util.List;

public class MovieReviewMain {
    public static void main(String[] args) {

        List<MovieReview> reviews = new ArrayList<>();

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews.add(inception);

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        reviews.add(aboutTime);

        MovieReview[] movieReviews = {inception, aboutTime};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목 : " + movieReview.title + ",  리뷰 : " + movieReview.review);
        }
    }
}
