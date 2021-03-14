/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying geometries to be built into an acceleration structure.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, the {@code aabbs} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryAabbsDataKHR} structure</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, the {@code triangles} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryTrianglesDataKHR} structure</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, the {@code instances} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryInstancesDataKHR} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code geometryType} <b>must</b> be a valid {@code VkGeometryTypeKHR} value</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, the {@code triangles} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryTrianglesDataKHR} structure</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, the {@code aabbs} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryAabbsDataKHR} structure</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, the {@code instances} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryInstancesDataKHR} structure</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}, {@link VkAccelerationStructureGeometryDataKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code geometryType} &ndash; describes which type of geometry this {@link VkAccelerationStructureGeometryKHR} refers to.</li>
 * <li>{@code geometry} &ndash; a {@link VkAccelerationStructureGeometryDataKHR} union describing the geometry data for the relevant geometry type.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkGeometryFlagBitsKHR} values describing additional properties of how the geometry should be built.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureGeometryKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkGeometryTypeKHR geometryType;
 *     {@link VkAccelerationStructureGeometryDataKHR VkAccelerationStructureGeometryDataKHR} geometry;
 *     VkGeometryFlagsKHR flags;
 * }</code></pre>
 */
public class VkAccelerationStructureGeometryKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GEOMETRYTYPE,
        GEOMETRY,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkAccelerationStructureGeometryDataKHR.SIZEOF, VkAccelerationStructureGeometryDataKHR.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GEOMETRYTYPE = layout.offsetof(2);
        GEOMETRY = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code geometryType} field. */
    @NativeType("VkGeometryTypeKHR")
    public int geometryType() { return ngeometryType(address()); }
    /** Returns a {@link VkAccelerationStructureGeometryDataKHR} view of the {@code geometry} field. */
    public VkAccelerationStructureGeometryDataKHR geometry() { return ngeometry(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkGeometryFlagsKHR")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureGeometryKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureGeometryKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code geometryType} field. */
    public VkAccelerationStructureGeometryKHR geometryType(@NativeType("VkGeometryTypeKHR") int value) { ngeometryType(address(), value); return this; }
    /** Copies the specified {@link VkAccelerationStructureGeometryDataKHR} to the {@code geometry} field. */
    public VkAccelerationStructureGeometryKHR geometry(VkAccelerationStructureGeometryDataKHR value) { ngeometry(address(), value); return this; }
    /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryKHR geometry(java.util.function.Consumer<VkAccelerationStructureGeometryDataKHR> consumer) { consumer.accept(geometry()); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkAccelerationStructureGeometryKHR flags(@NativeType("VkGeometryFlagsKHR") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryKHR set(
        int sType,
        long pNext,
        int geometryType,
        VkAccelerationStructureGeometryDataKHR geometry,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        geometryType(geometryType);
        geometry(geometry);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryKHR set(VkAccelerationStructureGeometryKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryKHR malloc() {
        return wrap(VkAccelerationStructureGeometryKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryKHR calloc() {
        return wrap(VkAccelerationStructureGeometryKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureGeometryKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryKHR create(long address) {
        return wrap(VkAccelerationStructureGeometryKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureGeometryKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAccelerationStructureGeometryKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAccelerationStructureGeometryKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryKHR mallocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryKHR callocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureGeometryKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryKHR.PNEXT); }
    /** Unsafe version of {@link #geometryType}. */
    public static int ngeometryType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureGeometryKHR.GEOMETRYTYPE); }
    /** Unsafe version of {@link #geometry}. */
    public static VkAccelerationStructureGeometryDataKHR ngeometry(long struct) { return VkAccelerationStructureGeometryDataKHR.create(struct + VkAccelerationStructureGeometryKHR.GEOMETRY); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureGeometryKHR.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureGeometryKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryKHR.PNEXT, value); }
    /** Unsafe version of {@link #geometryType(int) geometryType}. */
    public static void ngeometryType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureGeometryKHR.GEOMETRYTYPE, value); }
    /** Unsafe version of {@link #geometry(VkAccelerationStructureGeometryDataKHR) geometry}. */
    public static void ngeometry(long struct, VkAccelerationStructureGeometryDataKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryKHR.GEOMETRY, VkAccelerationStructureGeometryDataKHR.SIZEOF); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureGeometryKHR.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkAccelerationStructureGeometryKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryKHR.npNext(address()); }
        /** Returns the value of the {@code geometryType} field. */
        @NativeType("VkGeometryTypeKHR")
        public int geometryType() { return VkAccelerationStructureGeometryKHR.ngeometryType(address()); }
        /** Returns a {@link VkAccelerationStructureGeometryDataKHR} view of the {@code geometry} field. */
        public VkAccelerationStructureGeometryDataKHR geometry() { return VkAccelerationStructureGeometryKHR.ngeometry(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkGeometryFlagsKHR")
        public int flags() { return VkAccelerationStructureGeometryKHR.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureGeometryKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureGeometryKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code geometryType} field. */
        public VkAccelerationStructureGeometryKHR.Buffer geometryType(@NativeType("VkGeometryTypeKHR") int value) { VkAccelerationStructureGeometryKHR.ngeometryType(address(), value); return this; }
        /** Copies the specified {@link VkAccelerationStructureGeometryDataKHR} to the {@code geometry} field. */
        public VkAccelerationStructureGeometryKHR.Buffer geometry(VkAccelerationStructureGeometryDataKHR value) { VkAccelerationStructureGeometryKHR.ngeometry(address(), value); return this; }
        /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryKHR.Buffer geometry(java.util.function.Consumer<VkAccelerationStructureGeometryDataKHR> consumer) { consumer.accept(geometry()); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkAccelerationStructureGeometryKHR.Buffer flags(@NativeType("VkGeometryFlagsKHR") int value) { VkAccelerationStructureGeometryKHR.nflags(address(), value); return this; }

    }

}