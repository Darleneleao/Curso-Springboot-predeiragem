package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController{
    private DateUtil dateUtil;
    //localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDataTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime( "Berserk"));
    }

    @GetMapping(path = "list2")
    public List<Anime> list2(){
        log.info(dateUtil.formatLocalDataTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime( "Berserk"), new Anime( "One Piece"));
    }
}
