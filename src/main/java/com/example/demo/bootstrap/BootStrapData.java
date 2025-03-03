package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    //private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        //this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
        //this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {

        if (outsourcedPartRepository.count() == 0) {
            OutsourcedPart graphicsProcessingUnit = new OutsourcedPart();
            graphicsProcessingUnit.setCompanyName("NVIDIA");
            graphicsProcessingUnit.setName("Graphics Processing Unit");
            graphicsProcessingUnit.setInv(5);
            graphicsProcessingUnit.setMinInv(0);
            graphicsProcessingUnit.setMaxInv(25);
            graphicsProcessingUnit.setPrice(1200);
            graphicsProcessingUnit.setId(1);
            outsourcedPartRepository.save(graphicsProcessingUnit);

            OutsourcedPart centralProcessingUnit = new OutsourcedPart();
            centralProcessingUnit.setCompanyName("AMD");
            centralProcessingUnit.setName("Central Processing Unit");
            centralProcessingUnit.setInv(20);
            centralProcessingUnit.setMinInv(0);
            centralProcessingUnit.setMaxInv(35);
            centralProcessingUnit.setPrice(650);
            centralProcessingUnit.setId(2);
            outsourcedPartRepository.save(centralProcessingUnit);

            OutsourcedPart randomAccessMemory = new OutsourcedPart();
            randomAccessMemory.setCompanyName("GigaJawz");
            randomAccessMemory.setName("Random Access Memory");
            randomAccessMemory.setInv(40);
            randomAccessMemory.setMinInv(0);
            randomAccessMemory.setMaxInv(55);
            randomAccessMemory.setPrice(99);
            randomAccessMemory.setId(3);
            outsourcedPartRepository.save(randomAccessMemory);

            OutsourcedPart motherBoard = new OutsourcedPart();
            motherBoard.setCompanyName("ASUS");
            motherBoard.setName("Motherboard");
            motherBoard.setInv(30);
            motherBoard.setMinInv(0);
            motherBoard.setMaxInv(40);
            motherBoard.setPrice(189);
            motherBoard.setId(4);
            outsourcedPartRepository.save(motherBoard);

            OutsourcedPart solidStateDrive = new OutsourcedPart();
            solidStateDrive.setCompanyName("Samsung");
            solidStateDrive.setName("Solid State Drive");
            solidStateDrive.setInv(10);
            solidStateDrive.setMinInv(0);
            solidStateDrive.setMaxInv(25);
            solidStateDrive.setPrice(89);
            solidStateDrive.setId(5);
            outsourcedPartRepository.save(solidStateDrive);
        }

        if(productRepository.count() == 0) {
            Product pc = new Product(1,"PC", 3200.0, 15);
            productRepository.save(pc);
            Product KeyBoard = new Product(2,"Keyboard", 40.00, 12);
            productRepository.save(KeyBoard);
            Product Speakers = new Product(3,"Speakers", 79.00, 17);
            productRepository.save(Speakers);
            Product Mouse = new Product(4,"Mouse", 39.00, 34);
            productRepository.save(Mouse);
            Product Headset = new Product(5,"Headset", 109.00, 10);
            productRepository.save(Headset);

        }


    }

    // System.out.println(thePart.getCompanyName());

    // List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
    //for(OutsourcedPart part:outsourcedParts){
    //  System.out.println(part.getName()+" "+part.getCompanyName());
    // }

    // if (productRepository.count() == 0))


  /*  Product pC = new Product("PC", 1500.0, 15);
        productRepository.save(pC);
    Product KeyBoard = new Product("Keyboard", 40.00, 12);
        productRepository.save(KeyBoard);
    Product Speakers = new Product("Speakers", 79.00, 17);
        productRepository.save(Speakers);
    Product Mouse = new Product("Mouse", 39.00, 34);
        productRepository.save(Mouse);
    Product Headset = new Product("Headset", 109.00, 10);
        productRepository.save(Headset); */




       /* System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());
*/
    }

