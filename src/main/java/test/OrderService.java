package test;

public class OrderService {
    public static final String ORDER_MAIL_SUBJECT ="Biletele tale la film ";
    private UserRepository userRepository;
    private CinemaRoomService cinemaRoomService;
    private MovieRepository movieRepository;
    private ProjectionRepository projectionRepository;
    private SeatRepository seatRepository;
    private TicketRepository ticketRepository;
    private OrderRepository orderRepository;
    private MailService mailService;


    @Autowired
    public OrderService(UserRepository userRepository, CinemaRoomService cinemaRoomService, MovieRepository movieRepository, ProjectionRepository projectionRepository, SeatRepository seatRepository, TicketRepository ticketRepository, OrderRepository orderRepository, MailService mailService) {
        this.userRepository = userRepository;
        this.cinemaRoomService = cinemaRoomService;
        this.movieRepository = movieRepository;
        this.projectionRepository = projectionRepository;
        this.seatRepository = seatRepository;
        this.ticketRepository = ticketRepository;
        this.orderRepository = orderRepository;
        this.mailService = mailService;
    }

    //llll
    ////llkjlh

}
