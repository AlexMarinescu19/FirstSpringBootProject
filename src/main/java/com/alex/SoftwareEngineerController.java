package com.alex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/vi/software-engineers")
public class SoftwareEngineerController
{
    @GetMapping
    public List<SoftwareEngineer> getEngineers()
    {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        "js, node, react, tailwindcss"
                ),
                new SoftwareEngineer(
                        2,
                        "Jamila",
                        "java, spring, spring boot"
                )
        );
    }
}
