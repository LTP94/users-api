package io.github.luistrueba.usersapi.dto.response;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Class that implements a generic response error object to the API end-points.
 *
 */
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class ResponseError {

    @NotNull(message="Timestamp cannot be null")
    private LocalDateTime timestamp;

    @NotNull(message="Details cannot be null")
    private String details;

}