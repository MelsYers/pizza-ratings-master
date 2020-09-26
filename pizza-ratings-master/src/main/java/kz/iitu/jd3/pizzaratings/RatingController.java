package kz.iitu.jd3.pizzaratings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{pizzaId}")
    public Rating getRatingByPizzaId(
            @PathVariable("pizzaId") String pizzaId) {

        return new Rating(pizzaId, 5);
    }
}
